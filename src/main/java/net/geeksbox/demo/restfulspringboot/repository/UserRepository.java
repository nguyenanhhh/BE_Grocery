package net.geeksbox.demo.restfulspringboot.repository;

import net.geeksbox.demo.restfulspringboot.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(value="select * from [Users] where email=?1 and hash_password=?2",nativeQuery = true)
	public User checkAccount(String username,String email);
	@Query(value="select * from [Users] where email=?",nativeQuery = true)
	public User kiemtraemail(String email);
	@Query(value="select * from [Users] where phone=?",nativeQuery = true)
	public User kiemtraphone(String phone);
	@Query(value="select * from [Users] where role='2'",nativeQuery = true)
	public List<User> danhsachshipper();
	@Query(value = "select Users.userID, Users.name, Users.email, Users.phone, Users.salt, Users.hash_password, Users.role, Users.avatar, Users.point from Users inner join [Order] on	Users.userID=[Order].shipperID where [Order].storeID=? and Users.role='2' group by Users.userID, Users.name, Users.email, Users.phone, Users.hash_password, Users.role, Users.avatar, Users.point, Users.salt", nativeQuery = true)
	public List<User> shipperOfStore(int id); 
	
	@Query(value = "select Users.userID, Users.name, Users.email, Users.phone, Users.salt, Users.hash_password, Users.role, Users.avatar, Users.point from Users inner join UserFollowStore on	Users.userID=UserFollowStore.userID where UserFollowStore.storeID=? and UserFollowStore.isDeleted='false' group by Users.userID, Users.name, Users.email, Users.phone, Users.hash_password, Users.role, Users.avatar, Users.point, Users.salt", nativeQuery = true)
	public List<User> getfollowing(int id); 
	
	@Query(value="select Users.userID, Users.name, Users.email, Users.phone, Users.salt, Users.hash_password, Users.role, Users.avatar, Users.point from Users inner join [Order] on	Users.userID=[Order].userID where [Order].storeID=? group by Users.userID, Users.name, Users.email, Users.phone, Users.hash_password, Users.role, Users.avatar, Users.point, Users.salt", nativeQuery = true)
	public List<User>getCustomerOfStore(int id);
	
	
	@Query(value = "select * from Users where userID=?", nativeQuery = true)
	public User getUser(int id);
}
