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
import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.repository.CartEnityRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.CategoryRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.OrderEnityRepositiry;
import net.geeksbox.demo.restfulspringboot.service.OrderItemService;

@RestController
public class OrderEnityController {
	@Autowired
    private OrderItemService orderEnityRepositiry;

    @PostMapping("/saveorder")
  
	public ResponseEntity<OrderEnity> addProduct(@RequestBody OrderEnity product) {
    	OrderEnity savedProduct = orderEnityRepositiry.addorder(product);
	        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
	    }
    @PostMapping("/getdonhang")
    public List<OrderEnity> findall(@RequestParam("userID") int id)
    {
    	return orderEnityRepositiry.getbuUserID(id);
    }
    @PostMapping("/getTTdh")
    public List<OrderEnity> trangthai(@RequestParam("userID") int id,@RequestParam("status") String TT)
    {
    	return orderEnityRepositiry.getbyTT(id,TT);
    }
    @PostMapping("/getorder")
    public OrderEnity chitet(@RequestParam("orderID") int id) {
        return orderEnityRepositiry.getbyid(id);
    }
    @PostMapping("/capnhatdonhang")
    public OrderEnity update( @RequestBody OrderEnity product) {
        return orderEnityRepositiry.update(product.getOrderID(), product);
    }
}
