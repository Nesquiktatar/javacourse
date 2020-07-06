package ru.innopolis.stc.java.lesson25.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketImpl implements Basket {

    private Map<String, Integer> products;
    private static final String EMPTY = "Basket is Empty";

    public BasketImpl() {
        initMap();
    }

    @Override
    public void addProduct(String product, int quantity) {
        products.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        products.replace(product, quantity);
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public int getProductQuantity(String product) {
        if (!products.isEmpty()) {
            return products.get(product);
        } else {
            System.out.println(EMPTY);
            return 0;
        }
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    private void initMap() {
        products = new HashMap<>();
    }
}
