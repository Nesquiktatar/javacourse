package ru.innopolis.stc.java.lesson23.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BasketImpl implements Basket {

    private LinkedList<Product> productLinkedList = new LinkedList<>();

    @Override
    public void addProduct(String product, int quantity) {
        productLinkedList.add(new Product(product, quantity));
    }

    @Override
    public void removeProduct(String productName) {
        for (Product product: productLinkedList) {
            if (product.getProductName().equals(productName)) {
                productLinkedList.remove(product);
                break;
            }
        }
    }

    @Override
    public void updateProductQuantity(String productName, int quantity) {
        Product product = getProductByName(productName);
        if (product != null) {
            product.setQuantity(quantity);
        }
    }

    private Product getProductByName(String productName) {
        for (Product product : productLinkedList) {
            if (product.getProductName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void clear() {
        productLinkedList.clear();
    }

    @Override
    public List<String> getProducts() {
        if (productLinkedList.isEmpty()) {
            System.out.println("Empty basket");
            return null;
        }
        List<String> names = new ArrayList<>();
        for (Product product : productLinkedList) {
            names.add(product.getProductName());
        }
        return names;
    }

    @Override
    public int getProductQuantity(String productName) {
        int productQuantity = 0;
        for (Product product: productLinkedList) {
           if (product.getProductName().equals(productName)) {
               productQuantity =  product.getQuantity();
           }
        }
        return productQuantity;
    }

    public void printProducts() {
        for (Product product : productLinkedList) {
            System.out.println("Product name is: " + product.getProductName()
                    + "  Product count is: " + product.getQuantity());
        }
    }
}

