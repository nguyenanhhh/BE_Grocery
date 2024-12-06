package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.Category;
import net.geeksbox.demo.restfulspringboot.model.Product;

public interface CartRepositiry extends JpaRepository<Cart, Integer> {
	@Query(value="with b1 \r\n"
			+ "	as\r\n"
			+ "	(select Users.userID,Cart.cartID,CartItem.productID,CartItem.[count],CartItem.id\r\n"
			+ "					from (Users inner join Cart\r\n"
			+ "					on Users.userID=Cart.userID ) inner join CartItem on  Cart.cartID=CartItem.cartID)\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "					select *\r\n"
			+ "					from b1 inner join Products\r\n"
			+ "					on b1.productID=Products.productID\r\n"
			+ "					where userID=? ",nativeQuery = true)
	public List<Cart> getProductCart(int id);
	
}
