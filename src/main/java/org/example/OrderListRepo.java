package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderListRepo {
    private List<Order> orders = new ArrayList<>();

    public void add(Order order) {
        orders.add(order);
    }
    public void remove(String orderId){
        Iterator<Order> iterator = orders.iterator();
        while(iterator.hasNext()){
            Order order = iterator.next();
            if(order.orderId().equals(orderId)){
                iterator.remove();
            }
        }
    }
    public Order findByOrder(String orderId){
        for(Order order:orders){
            if(order.orderId().equals(orderId)){
                return order;
            }
        }
        return null;
    }
    public List<Order> findByProduct(String productId){
        List<Order> result = new ArrayList<>();
        for(Order order:orders){
            if(order.productId().equals(productId)){
                result.add(order);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orders=" + orders +
                '}';
    }
}
