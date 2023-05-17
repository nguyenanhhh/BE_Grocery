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
import net.geeksbox.demo.restfulspringboot.model.ProductOnTop5;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.ProductRepositiry;
import net.geeksbox.demo.restfulspringboot.service.ProductService;
import net.geeksbox.demo.restfulspringboot.service.UserService;

@RestController
public class ProductController {
	 @Autowired
	    private ProductRepositiry productRepositiry;
	 @Autowired
	    private ProductService productService;

	    @GetMapping("/sanpham")
	    public List<Product> findAll() {
	        return productRepositiry.FindAll();
	    }
	    @PostMapping("/sanphamcate")
	    public List<Product> getcategory(@RequestParam("categoryID") int id) {
	        return productRepositiry.getproductbycateID(id);
	    }
	    @PostMapping("/sanphamstore")
	    public List<Product> getproductstore(@RequestParam("storeID") int id) {
	        return productRepositiry.getproductbystoreID(id);
	    }
	    @GetMapping("/top5")
	    public List<Product> Top5() {
	        return productRepositiry.top5();
	    }
	    @DeleteMapping("/product/{id}")
	    public void delete(@PathVariable int id) {
	        productRepositiry.deleteById(id);
	    }
	    @PostMapping("/chitiet")
	    public Product chitet(@RequestParam("productID") int id) {
	        return productRepositiry.chitiet(id);
	    }
	    
	    @PostMapping("/savesanpham")
	    
		public ResponseEntity<Product> addProduct(@RequestBody Product product) {
	    	Product savedProduct = productRepositiry.save(product);
		        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
		    }
	    @PostMapping("/updateproduct")
	    public Product update( @RequestBody Product product) {
	        return productService.update(product.getProductID(), product);
	    } 
	    @PostMapping("/timkiem")
	    public List<Product> timkiem(@RequestParam("key") String key ) {
	        return productRepositiry.timkiem("%" + key + "%");
	    } 
	    @PostMapping("/gettop5productofstore")
		   public List<ProductOnTop5> top5ProOfStore(@RequestParam("storeID") int storeID,@RequestParam("year") int year){
			   	return productService.getTop5ProOfStore(storeID, year);
		   }
}
