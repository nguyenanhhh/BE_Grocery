package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.Category;
import net.geeksbox.demo.restfulspringboot.model.DonHangModel;
import net.geeksbox.demo.restfulspringboot.model.DonHang_Shop_Model;
import net.geeksbox.demo.restfulspringboot.model.Product;

public interface DonHang_Shop_Repositiry extends JpaRepository<DonHang_Shop_Model, Integer> {
	@Query(value="with b1\r\n"
			+ "			as\r\n"
			+ "			(select Products.productID,order_Item.count,order_Item.orderID,Products.img,Products.name,Products.price,Products.storeID  from (order_Item inner join Products on Products.productID=order_Item.productID) )\r\n"
			+ "			select b1.productID,b1.count,b1.img,b1.name,b1.price,b1.storeID,Stores.name as nameshop,b1.orderID,[Order].address,[Order].status,[Order].statusTT,[Order].shipperID from (b1 inner join Stores on b1.storeID=Stores.storeID) inner join [Order] on b1.orderID=[Order].orderID\r\n"
			+ "			where b1.storeID=?",nativeQuery = true)
	public List<DonHang_Shop_Model> getDH(int id);
	@Query(value="with b1\r\n"
			+ "			as\r\n"
			+ "			(select Products.productID,order_Item.count,order_Item.orderID,Products.img,Products.name,Products.price,Products.storeID  from (order_Item inner join Products on Products.productID=order_Item.productID) )\r\n"
			+ "			select b1.productID,b1.count,b1.img,b1.name,b1.price,b1.storeID,Stores.name as nameshop,b1.orderID,[Order].address,[Order].status,[Order].statusTT,[Order].shipperID from (b1 inner join Stores on b1.storeID=Stores.storeID) inner join [Order] on b1.orderID=[Order].orderID\r\n"
			+ "			where b1.storeID=?1 and [Order].status=?2",nativeQuery = true)
	public List<DonHang_Shop_Model> trangthai(int id,String status);
	
	@Query(value="with b1\r\n"
			+ "			as\r\n"
			+ "			(select Products.productID,order_Item.count,order_Item.orderID,Products.img,Products.name,Products.price,Products.storeID  from (order_Item inner join Products on Products.productID=order_Item.productID) )\r\n"
			+ "			select b1.productID,b1.count,b1.img,b1.name,b1.price,b1.storeID,Stores.name as nameshop,b1.orderID,[Order].address,[Order].status,[Order].statusTT,[Order].shipperID from (b1 inner join Stores on b1.storeID=Stores.storeID) inner join [Order] on b1.orderID=[Order].orderID\r\n"
			+ "			where shipperID=?1 and [Order].status=?2",nativeQuery = true)
	public List<DonHang_Shop_Model> shipperDH(int id,String status);
	
	@Query(value="with b1 as (select Products.productID,order_Item.count,order_Item.orderID,Products.img,Products.name,Products.price,Products.storeID  from (order_Item inner join Products on Products.productID=order_Item.productID) ) \r\n"
			+ "select b1.productID,b1.count,b1.img,b1.name,b1.price,b1.storeID,Stores.name as nameshop,b1.orderID,[Order].address,[Order].status,[Order].statusTT,[Order].shipperID from (b1 inner join Stores on b1.storeID=Stores.storeID) inner join [Order] on b1.orderID=[Order].orderID\r\n"
			+ "where shipperID=?1 and Stores.storeID=?2", nativeQuery = true)
	public List<DonHang_Shop_Model> getOrderOfShipperOnStore(int shipperID, int storeID);
}
