package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.User;

public interface ProductRepositiry extends  JpaRepository<Product, Integer> {
	@Query(value="select top 5 * from [Products] ",nativeQuery = true)
	public List<Product> top5();
	
	@Query(value="select  * from [Products] where productID=? ",nativeQuery = true)
	public Product chitiet(int id);
	@Query(value="select  * from [Products] where categoryID=? ",nativeQuery = true)
	public List<Product> getproductbycateID(int id);
}
