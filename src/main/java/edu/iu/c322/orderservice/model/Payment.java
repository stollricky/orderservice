package edu.iu.c322.orderservice.model;

import java.util.Objects;

class Payment {
    private String cardNumber;
    private String cardholderName;
    private String expirationDate;
    private int cvv;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return cvv == payment.cvv &&
                Objects.equals(cardNumber, payment.cardNumber) &&
                Objects.equals(cardholderName, payment.cardholderName) &&
                Objects.equals(expirationDate, payment.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cardholderName, expirationDate, cvv);
    }
}
