package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.CartEnity;
import net.geeksbox.demo.restfulspringboot.model.OrderEnity;
import net.geeksbox.demo.restfulspringboot.model.OrderItemEnity;

public interface OrderItemEnityRepositiry extends JpaRepository<OrderItemEnity, Integer> {
	
	
}

