package net.geeksbox.demo.restfulspringboot.service;

import net.geeksbox.demo.restfulspringboot.model.CartItem;
import net.geeksbox.demo.restfulspringboot.model.OrderEnity;
import net.geeksbox.demo.restfulspringboot.model.OrderItemEnity;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.CartitemRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.OrderEnityRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.OrderItemEnityRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import java.util.List;

@Service
public class OrderItemEnityServiceImpl implements OrderItemEnityService{

    @Autowired
    private OrderItemEnityRepositiry orderEnityRepositiry;


	@Override
	public OrderItemEnity addorder(OrderItemEnity orderEnity) {
		// TODO Auto-generated method stub
		return orderEnityRepositiry.save(orderEnity);
	}

	

  

}
