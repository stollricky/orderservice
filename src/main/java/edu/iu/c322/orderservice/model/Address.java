package edu.iu.c322.orderservice.model;

import java.util.Objects;

class Address {
    private String state;
    private String city;
    private int postalCode;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return postalCode == address.postalCode && Objects.equals(state, address.state) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, city, postalCode);
    }
}
