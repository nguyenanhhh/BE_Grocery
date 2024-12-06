package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.CartEnity;
import net.geeksbox.demo.restfulspringboot.model.CartItem;

public interface CartitemRepositiry extends JpaRepository<CartItem, Integer> {
	

}

