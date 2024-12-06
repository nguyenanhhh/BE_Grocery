package net.geeksbox.demo.restfulspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.geeksbox.demo.restfulspringboot.model.CartEnity;
import net.geeksbox.demo.restfulspringboot.model.Category;
import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.repository.CartEnityRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.CategoryRepositiry;

@RestController
public class CartEnityController {
	@Autowired
    private CartEnityRepositiry cartEnity;

    @PostMapping("/getidcart")
    public CartEnity findAll(@RequestParam("userID") int id) {
        return cartEnity.getbyid(id);
    }
    @PostMapping("/taogiohang")
	public ResponseEntity<CartEnity> addcart(@RequestBody CartEnity product) {
    	CartEnity savedProduct = cartEnity.save(product);
	        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
	    }

}
