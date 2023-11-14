package org.example;

import java.util.List;

public interface OrderRepoInterface {
    void addOrder(Order order);
    void removeOrder(String orderId);
    List<Order> findOrderByProduct(String productId);
    Product findProduct(String productId);
}
