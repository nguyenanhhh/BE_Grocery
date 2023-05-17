package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.User;

public interface ProductRepositiry extends  JpaRepository<Product, Integer> {
	@Query(value="Select top 5 * from Products order by sold DESC ",nativeQuery = true)
	public List<Product> top5();
	
	@Query(value="select * from [Products] where Is_Selling='true' and Is_Active='true'",nativeQuery = true)
	public List<Product> FindAll();
	@Query(value="select  * from [Products] where productID=? ",nativeQuery = true)
	public Product chitiet(int id);
	@Query(value="select  * from [Products] where categoryID=? ",nativeQuery = true)
	public List<Product> getproductbycateID(int id);
	
	@Query(value="select  * from [Products] where storeID=? ",nativeQuery = true)
	public List<Product> getproductbystoreID(int id);
	
	@Query(value="select  * from [Products] where name LIKE ? ",nativeQuery = true)
	public List<Product> timkiem(String key);
	
	@Query(value="select Products.productID, Products.name, products.img, bang1.countSold From Products inner join (select  CartItem.productID as productID, sum(count) as countSold  From Products, CartItem where Products.storeID=?1 and Products.productID=CartItem.productID and YEAR(CartItem.created_At)=?2 group by CartItem.productID order by sum(count) DESC OFFSET 0 rows fetch next 5 rows only) as bang1 on Products.productID = bang1.productID", nativeQuery=true)
	public List<Object[]> top5productOfStore(int storeID, int year);
}
