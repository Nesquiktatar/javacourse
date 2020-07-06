package ru.innopolis.stc.java.lesson23.task1;

public class Product {
    private String productName;
    private int quantity;

    public Product(String name, int quantity) {
        this.productName = name;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


