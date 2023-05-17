package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.Category;
import net.geeksbox.demo.restfulspringboot.model.DonHangModel;
import net.geeksbox.demo.restfulspringboot.model.Product;

public interface DonHangRepositiry extends JpaRepository<DonHangModel, Integer> {
	@Query(value="with b1\r\n"
			+ "as\r\n"
			+ "(select Products.productID,order_Item.count,order_Item.orderID,Products.img,Products.name,Products.price,Products.storeID  from (order_Item inner join Products on Products.productID=order_Item.productID) )\r\n"
			+ "select b1.productID,b1.count,b1.img,b1.name,b1.price,b1.storeID,Stores.name as nameshop,b1.orderID from b1 inner join Stores on b1.storeID=Stores.storeID \r\n"
			+ "where b1.orderID=?",nativeQuery = true)
	public List<DonHangModel> getitemorder(int id);
	
	
	
}
