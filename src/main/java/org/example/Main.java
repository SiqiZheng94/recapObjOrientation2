package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("aa","11",10.3);
        Product product2 = new Product("bb","22",5.5);
        Product product3 = new Product("cc","33",100.0);
        ProductRepo productRepo = new ProductRepo();
        productRepo.add(product1);
        productRepo.add(product2);
        productRepo.remove("22");
        System.out.println(productRepo);
        System.out.println(productRepo.query("11"));
        System.out.println(productRepo.query("33"));

        OrderListRepo orderListRepo = new OrderListRepo();
        Order order1 = new Order("AA","11",100);
        Order order2 = new Order("AA","99",100);

        OrderMapRepo orderMapRepo = new OrderMapRepo(productRepo);
        ShopService shopService = new ShopService(orderMapRepo);
        shopService.placeNewOrder(order1);



        ShopService2 shopService2 = new ShopService2();
        OrderMapRepo2 orderMapRepo2 = new OrderMapRepo2(productRepo);
        shopService2.placeNewOrder(orderMapRepo2,order1);
        shopService2.placeNewOrder(orderMapRepo2,order2);
    }
}