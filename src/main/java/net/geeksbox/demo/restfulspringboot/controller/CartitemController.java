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
import net.geeksbox.demo.restfulspringboot.model.CartItem;
import net.geeksbox.demo.restfulspringboot.model.Category;
import net.geeksbox.demo.restfulspringboot.repository.CartEnityRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.CartitemRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.CategoryRepositiry;
import net.geeksbox.demo.restfulspringboot.service.CartitemServiceImpl;

@RestController
public class CartitemController {
	@Autowired
    private CartitemServiceImpl cartitemServiceImpl;
	@Autowired
    private CartitemRepositiry cartitemRepositiry;

	 @PostMapping("/save")
	  public ResponseEntity<CartItem> addProduct(@RequestBody CartItem product) {
		 CartItem savedProduct = cartitemServiceImpl.addProduct(product);
	        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
	    }
	 @DeleteMapping("/cart/{id}")
	    public void delete(@PathVariable int id) {
		 cartitemRepositiry.deleteById(id);
	    }
	 
}
