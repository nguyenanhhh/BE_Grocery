package net.geeksbox.demo.restfulspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.ProductRepositiry;
import net.geeksbox.demo.restfulspringboot.service.UserService;

@RestController
public class ProductController {
	 @Autowired
	    private ProductRepositiry productRepositiry;

	    @GetMapping("/sanpham")
	    public List<Product> findAll() {
	        return productRepositiry.findAll();
	    }
	    @PostMapping("/sanphamcate")
	    public List<Product> getcategory(@RequestParam("categoryID") int id) {
	        return productRepositiry.getproductbycateID(id);
	    }
	    @GetMapping("/top5")
	    public List<Product> Top5() {
	        return productRepositiry.top5();
	    }

	    @PostMapping("/chitiet")
	    public Product chitet(@RequestParam("productID") int id) {
	        return productRepositiry.chitiet(id);
	    }
}
