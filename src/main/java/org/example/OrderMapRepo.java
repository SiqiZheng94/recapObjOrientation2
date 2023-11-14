package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepoInterface {
    private Map<String, Order> orderMap = new HashMap<>();
    private ProductRepo productRepo;

    public OrderMapRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public void addOrder(Order order) {
        orderMap.put(order.orderId(), order);
    }

    @Override
    public void removeOrder(String orderId) {
        orderMap.remove(orderId);
    }

    @Override
    public List<Order> findOrderByProduct(String productId) {
        List<Order> result = new ArrayList<>();
        for (Order order : orderMap.values()) {
            if (order.productId().equals(productId)) {
                result.add(order);
            }
        }
        return result;
    }

    @Override
    public Product findProduct(String productId) {
        return productRepo.query(productId);
    }
}
