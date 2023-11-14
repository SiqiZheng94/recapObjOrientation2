package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("aa","11");
        Product product2 = new Product("bb","22");
        Product product3 = new Product("cc","33");
        ProductRepo productRepo = new ProductRepo();
        productRepo.add(product1);
        productRepo.add(product2);
        productRepo.remove("22");
        System.out.println(productRepo);
        System.out.println(productRepo.query("11"));
        System.out.println(productRepo.query("33"));

        OrderListRepo orderListRepo = new OrderListRepo();
        Order order1 = new Order("AA","11",100);

        OrderMapRepo orderMapRepo = new OrderMapRepo(productRepo);
        ShopService shopService = new ShopService(orderMapRepo);
        shopService.placeNewOrder(order1);




    }
}