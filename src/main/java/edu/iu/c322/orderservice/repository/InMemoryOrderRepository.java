package edu.iu.c322.orderservice.repository;

import edu.iu.c322.orderservice.model.Order;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

public class InMemoryOrderRepository{

    private List<Order> orders = new ArrayList<>();

    public List<Order> findAll() {
        return orders;
    }

    public int create(Order order) {
        int id = orders.size() + 1;
        order.setId(id);
        orders.add(order);
        return id;
    }

    public void update(Order order, int id) {
        Order x = getOrderById(id);
        if (x != null) {
            x.setCustomerId(order.getCustomerId());
            x.setTotal(order.getTotal());
            x.setShippingAddress(order.getShippingAddress());
            x.setItems(order.getItems());
            x.setPayment(order.getPayment());
        } else {
            throw new IllegalStateException("Order id is not valid");
        }
    }

    public void delete(int id) {
        Order x = getOrderById(id);
        if (x != null) {
            orders.remove(x);
        } else {
            throw new IllegalStateException("Order id is not valid");
        }
    }

    private Order getOrderById(int id) {
        return orders.stream().filter(x -> x.getId() == id).findAny().orElse(null);
    }
}
