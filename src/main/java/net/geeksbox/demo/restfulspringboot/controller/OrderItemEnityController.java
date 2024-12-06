package net.geeksbox.demo.restfulspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.geeksbox.demo.restfulspringboot.model.CartEnity;
import net.geeksbox.demo.restfulspringboot.model.CartItem;
import net.geeksbox.demo.restfulspringboot.model.Category;
import net.geeksbox.demo.restfulspringboot.model.OrderEnity;
import net.geeksbox.demo.restfulspringboot.model.OrderItemEnity;
import net.geeksbox.demo.restfulspringboot.repository.CartEnityRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.CategoryRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.OrderEnityRepositiry;
import net.geeksbox.demo.restfulspringboot.service.OrderItemEnityService;
import net.geeksbox.demo.restfulspringboot.service.OrderItemService;

@RestController
public class OrderItemEnityController {
	@Autowired
    private OrderItemEnityService orderEnityRepositiry;

    @PostMapping("/saveorderitem")
  
	public ResponseEntity<OrderItemEnity> addProduct(@RequestBody OrderItemEnity product) {
    	OrderItemEnity savedProduct = orderEnityRepositiry.addorder(product);
	        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
	    }

}
