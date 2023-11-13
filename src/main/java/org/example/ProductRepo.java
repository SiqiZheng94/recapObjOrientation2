package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductRepo {
    private List<Product> products = new ArrayList<>();

    public ProductRepo() {
    }

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    public void add(Product product){
        products.add(product);
    }
    public void remove(String productId){
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            if(product.productId().equals(productId)){
                iterator.remove();

            }
        }

    }
    public Product query(String productId){
        Iterator<Product> iterator = products.iterator();
        while(iterator.hasNext()){
            Product product = iterator.next();
            if(product.productId().equals(productId)){
                return product;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
