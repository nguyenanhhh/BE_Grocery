package net.geeksbox.demo.restfulspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.DiaChiEnity;
import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.CartRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.CategoryRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.DiaChiRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.ProductRepositiry;
import net.geeksbox.demo.restfulspringboot.service.UserService;

@RestController
public class DiaChiController {
	 @Autowired
	    private DiaChiRepositiry productRepositiry;

	 @PostMapping("/diaChi")
	    public DiaChiEnity getdiachi(@RequestParam("userID") int id) {
	        return productRepositiry.getmaindiachi(id);
	    }
}

