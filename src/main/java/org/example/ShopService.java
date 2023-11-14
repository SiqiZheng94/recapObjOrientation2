package org.example;

public class ShopService {

    private OrderRepoInterface orderRepo;



    public ShopService(OrderRepoInterface orderRepo) {
        this.orderRepo = orderRepo;
    }

    public void placeNewOrder(Order order){

        if(orderRepo.findProduct(order.productId())!=null){
            orderRepo.addOrder(order);
            System.out.println("Order placed successfully!");
        }else{
            System.out.println("Ordered product doesn't exist.");
        }

    }
}
