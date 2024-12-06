package net.geeksbox.demo.restfulspringboot.service;

import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.ProductOnTop5;
import net.geeksbox.demo.restfulspringboot.model.User;

import java.util.List;

public interface ProductService {
   
    Product update(int id, Product user);
    List<ProductOnTop5> getTop5ProOfStore(int storeID, int year);
    
}

