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

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.DiaChiEnity;
import net.geeksbox.demo.restfulspringboot.model.FollowUsserModel;
import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.CartRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.CategoryRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.FollowRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.ProductRepositiry;
import net.geeksbox.demo.restfulspringboot.service.UserService;

@RestController
public class FollowController {
	 @Autowired
	    private FollowRepositiry followRepositiry;

	 @PostMapping("/theodoi")
	 public ResponseEntity<FollowUsserModel> save(@RequestBody FollowUsserModel follow) {
	    	FollowUsserModel savedProduct = followRepositiry.Save(follow.getIsDeleted(),follow.getStoreID(),follow.getUserID());
		        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
		    }
	 @PostMapping("/followed")
	    public List<FollowUsserModel> getfollow(@RequestParam("userID") int id,@RequestParam("storeID") int stid) {
	        return followRepositiry.checkfolloweds(stid,id);
	    }
	 @DeleteMapping("/follow/{id}")
	    public void delete(@PathVariable int id) {
		 followRepositiry.delete(id);
	    }
	
}

