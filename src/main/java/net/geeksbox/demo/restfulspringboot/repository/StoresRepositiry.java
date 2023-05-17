package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.StoreEnity;
import net.geeksbox.demo.restfulspringboot.model.User;

public interface StoresRepositiry extends  JpaRepository<StoreEnity, Integer> {
	@Query(value="select * from [Stores] where ownerID=?",nativeQuery = true)
	public List<StoreEnity> getshop(int id);
	@Query(value="select * from [Stores] where storeID=?",nativeQuery = true)
	public StoreEnity getshopbyid(int id);
	@Query(value = "select Users.userID, Users.name, Users.email, Users.phone, Users.salt, Users.hash_password, Users.role, Users.avatar, Users.point from Users inner join [Order] on	Users.userID=[Order].shipperID where [Order].storeID=2 and Users.role='2' group by Users.userID, Users.name, Users.email, Users.phone, Users.hash_password, Users.role, Users.avatar, Users.point, Users.salt", nativeQuery = true)
	public List<User> shipperOfStore(int id);
}
