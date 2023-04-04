package net.geeksbox.demo.restfulspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.geeksbox.demo.restfulspringboot.model.Category;
import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.repository.CategoryRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.ProductRepositiry;

@RestController
public class CategoryController {
	 	@Autowired
	    private CategoryRepositiry categoryRepositiry;

	    @GetMapping("/category")
	    public List<Category> findAll() {
	        return categoryRepositiry.findAll();
	    }

}
