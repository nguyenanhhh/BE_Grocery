package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.CartEnity;
import net.geeksbox.demo.restfulspringboot.model.DiaChiEnity;
import net.geeksbox.demo.restfulspringboot.model.OrderEnity;

public interface OrderEnityRepositiry extends JpaRepository<OrderEnity, Integer> {
	@Query(value="select *from [Order] where userID=?",nativeQuery = true)
	public List<OrderEnity> getOrderByUserID(int id);
	@Query(value="select *from [Order] where orderID=?",nativeQuery = true)
	public OrderEnity getbyid(int id);
	@Query(value="select *from [Order] where userID=?",nativeQuery = true)
	public List<OrderEnity> getByStoreID(int id);
	@Query(value="select *from [Order] where userID=?1 and status=?2",nativeQuery = true)
	public List<OrderEnity> getstatus(int id,String tt);
	
}

