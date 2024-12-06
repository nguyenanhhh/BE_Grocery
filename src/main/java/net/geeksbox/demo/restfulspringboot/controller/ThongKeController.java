package net.geeksbox.demo.restfulspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.geeksbox.demo.restfulspringboot.model.ThongKeModel;
import net.geeksbox.demo.restfulspringboot.repository.ThongKeRepositiry;
@RestController
public class ThongKeController {

	@Autowired
	private ThongKeRepositiry thongKeRepositiry;

	
	  @PostMapping("/thongke") 
	  public List<ThongKeModel> thongke(@RequestParam("year") int year, @RequestParam("storeID") int id) { 

		  
		  
		  return  thongKeRepositiry.getThongKeTheoThang(year, id); }
	 
}