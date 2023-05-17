package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.CartEnity;

public interface CartEnityRepositiry extends JpaRepository<CartEnity, Integer> {
	@Query(value="select *from Cart where userID=?",nativeQuery = true)
	public CartEnity getbyid(int id);
	
}

