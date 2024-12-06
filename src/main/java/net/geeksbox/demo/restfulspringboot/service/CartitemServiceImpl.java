package net.geeksbox.demo.restfulspringboot.service;

import net.geeksbox.demo.restfulspringboot.model.CartItem;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.CartitemRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import java.util.List;

@Service
public class CartitemServiceImpl implements CartItemService{

    @Autowired
    private CartitemRepositiry cartitemRepositiry;

	@Override
	public CartItem addProduct(CartItem cartItem) {
		// TODO Auto-generated method stub
		return cartitemRepositiry.save(cartItem);
	}

  

}
