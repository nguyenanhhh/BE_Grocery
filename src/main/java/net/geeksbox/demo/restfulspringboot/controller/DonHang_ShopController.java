package net.geeksbox.demo.restfulspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.DonHangModel;
import net.geeksbox.demo.restfulspringboot.model.DonHang_Shop_Model;
import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.CartRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.CategoryRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.DonHangRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.DonHang_Shop_Repositiry;
import net.geeksbox.demo.restfulspringboot.repository.ProductRepositiry;
import net.geeksbox.demo.restfulspringboot.service.UserService;

@RestController
public class DonHang_ShopController {
	 @Autowired
	    private DonHang_Shop_Repositiry donHangRepositiry;

	 @PostMapping("/donhangshop")
	    public List<DonHang_Shop_Model> cartitem(@RequestParam("storeID") int id) {
	        return donHangRepositiry.getDH(id);
	    }
	    @PostMapping("/trangthai")
	    public List<DonHang_Shop_Model> trangthai(@RequestParam("storeID") int id,@RequestParam("status") String status) {
	        return donHangRepositiry.trangthai(id,status);
	    }
	 
	    @PostMapping("/DHshipper")
	    public List<DonHang_Shop_Model> DHshipper(@RequestParam("shipperID") int id,@RequestParam("status") String status) {
	        return donHangRepositiry.shipperDH(id,status);
	    }
	 
	 
}

