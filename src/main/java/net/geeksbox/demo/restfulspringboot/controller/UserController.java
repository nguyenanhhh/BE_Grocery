package net.geeksbox.demo.restfulspringboot.controller;

import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> findAll() {
        return userService.findAll();
    }
    @PostMapping("/login")
    public User login(@RequestParam("email") String username,@RequestParam("hash_password") String hash_password ) {
        return userService.checkAccount(username, hash_password);
    }	
    @PostMapping("/updateuser")
    public User update( @RequestBody User user) {
        return userService.update(user.getUserID(), user);
    }
    @PostMapping("/dangky")
    
	public ResponseEntity<User> addProduct(@RequestBody User user) {
    	User saveUser = userService.dangky(user);
	        return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
	    }
    @PostMapping("/kiemtraemail")
    public User kiemtraemail(@RequestParam("email") String email) {
        return userService.kiemtraemail(email);
    }
    @PostMapping("/kiemtraphone")
    public User kiemtraphone(@RequestParam("phone") String phone) {
        return userService.kiemtraphone(phone);
    }
    @GetMapping("/danhsachshipper")
    public List<User> danhsachshipper() {
        return userService.danhsachshipper();
    }
    
}
