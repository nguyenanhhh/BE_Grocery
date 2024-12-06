package net.geeksbox.demo.restfulspringboot.service;

import java.util.List;

import net.geeksbox.demo.restfulspringboot.model.CartItem;
import net.geeksbox.demo.restfulspringboot.model.OrderEnity;
import net.geeksbox.demo.restfulspringboot.model.Product;

public interface OrderItemService {
	public OrderEnity addorder(OrderEnity orderEnity);
	public List<OrderEnity> getbuUserID(int id);
	public OrderEnity getbyid(int id);
	public List<OrderEnity> getbyTT(int id,String status);
	OrderEnity update(int id, OrderEnity user);
}
