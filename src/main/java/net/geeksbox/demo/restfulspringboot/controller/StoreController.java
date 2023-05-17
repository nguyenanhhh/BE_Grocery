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

import net.geeksbox.demo.restfulspringboot.model.DonHang_Shop_Model;
import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.StoreEnity;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.DonHang_Shop_Repositiry;
import net.geeksbox.demo.restfulspringboot.repository.ProductRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.StoresRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.UserRepository;
import net.geeksbox.demo.restfulspringboot.service.UserService;

@RestController
public class StoreController {
	 @Autowired
	    private StoresRepositiry storesRepositiry;

	 @Autowired
	    private UserRepository userRepository;
	 @Autowired
	    private DonHang_Shop_Repositiry	 donHang_Shop_Repositiry;
	    @PostMapping("/getstore")
	    public List<StoreEnity> findAll(@RequestParam("ownerID") int id) {
	        return storesRepositiry.getshop(id);
	    }
	    @PostMapping("/getstorebyid")
	    public StoreEnity getbyid(@RequestParam("storeID") int id) {
	        return storesRepositiry.getshopbyid(id);
	    }
	    @PostMapping("/dkshop")
	   
		public ResponseEntity<StoreEnity> addProduct(@RequestBody StoreEnity st) {
	    	StoreEnity savedst = storesRepositiry.save(st);
		        return new ResponseEntity<>(savedst, HttpStatus.CREATED);
		    }
	    @PostMapping("/getshipperofstore")
	    public List<User> getShipperOfStore(@RequestParam("storeID") int id){
	    	return userRepository.shipperOfStore(id);
	    }
	    
	    
	    @PostMapping("/getfollowing")
	    public List<User> getUserFollowing(@RequestParam("storeID") int id){
	    	return userRepository.getfollowing(id);
	    	
	    }
	    
	    @PostMapping("/getcustomerpaid")
	    public List<User> getCustomerOfStore(@RequestParam("storeID") int id){
	    	return userRepository.getCustomerOfStore(id);
	    } 
	   
	    @PostMapping("/getshipper")
	    public User getShipper(@RequestParam("shipperID") int id) {
	    	return userRepository.getUser(id);
	    	
	    }
	    
	    @PostMapping("/getorderofshipperonstore")
	    public List<DonHang_Shop_Model> getOrderOfShipperOnStore(@RequestParam("shipperID") int shipperID, @RequestParam("storeID")int storeID){
	    	return donHang_Shop_Repositiry.getOrderOfShipperOnStore(shipperID, storeID);
	    
	    }
}
