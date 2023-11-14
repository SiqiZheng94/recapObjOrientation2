package org.example;

import java.util.List;

public interface OrderRepoInterface2 {
    void addOrder(Order order);
    void removeOrder(String orderId);
    List<Order> findOrderByProduct(String productId);
    Product findProduct(String productId);
    void placeNewOrder(Order order);

}
