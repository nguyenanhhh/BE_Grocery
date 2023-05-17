package net.geeksbox.demo.restfulspringboot.service;

import net.geeksbox.demo.restfulspringboot.model.CartItem;
import net.geeksbox.demo.restfulspringboot.model.OrderEnity;
import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.CartitemRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.OrderEnityRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import java.util.List;

@Service
public class OrderitemServiceImpl implements OrderItemService{

    @Autowired
    private OrderEnityRepositiry orderEnityRepositiry;

	@Override
	public OrderEnity addorder(OrderEnity orderEnity) {
		// TODO Auto-generated method stub
		return orderEnityRepositiry.save(orderEnity);
	}

	@Override
	public List<OrderEnity> getbuUserID(int id) {
		// TODO Auto-generated method stub
		return orderEnityRepositiry.getOrderByUserID(id);
	}

	@Override
	public OrderEnity getbyid(int id) {
		// TODO Auto-generated method stub
		return orderEnityRepositiry.getbyid(id);
	}

	@Override
	public OrderEnity update(int id, OrderEnity user) {
		OrderEnity fromDB = orderEnityRepositiry.findById(id).orElse(null);
        if (fromDB == null) {
            return null;
        }
        fromDB.setUserID(user.getUserID());
        fromDB.setStoreID(user.getStoreID());
        fromDB.setAddress(user.getAddress());
        fromDB.setPhone(user.getPhone());
        fromDB.setStatusTT(user.getStatusTT());
        fromDB.setStatus(user.getStatus());
        fromDB.setShipperID(user.getShipperID());
        fromDB.setCostSum(user.getCostSum());
       
        return orderEnityRepositiry.save(fromDB);
	}

	@Override
	public List<OrderEnity> getbyTT(int id, String status) {
		// TODO Auto-generated method stub
		return orderEnityRepositiry.getstatus(id, status);
	}

	

	

  

}
