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

import net.geeksbox.demo.restfulspringboot.model.OrderEnity;
import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.Review;
import net.geeksbox.demo.restfulspringboot.model.ReviewModel;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.ProductRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.ReviewRepositiry;
import net.geeksbox.demo.restfulspringboot.service.ProductService;
import net.geeksbox.demo.restfulspringboot.service.UserService;

@RestController
public class ReviewController {
	 @Autowired
	    private ReviewRepositiry repositiry;
	    @PostMapping("/danhgia")
	    
		public ResponseEntity<Review> addProduct(@RequestBody Review review) {
	    	Review savedProduct = repositiry.save(review);
		        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
		    }
	    @PostMapping("/checkdanhgia")
	    public List<ReviewModel> kiemtradanhgia(@RequestParam("orderID") int id,@RequestParam("userID") int userid) {
	        return repositiry.checkdadanhgia(id,userid);
	    }
	    
	   
	   
}
