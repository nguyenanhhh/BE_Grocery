package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.Category;
import net.geeksbox.demo.restfulspringboot.model.FollowUsserModel;
import net.geeksbox.demo.restfulspringboot.model.Product;

public interface FollowRepositiry extends JpaRepository<FollowUsserModel, Integer> {
	@Query(value="select  * from [UserFollowStore] where storeID=?1 and userID=?2 ",nativeQuery = true)
	public List<FollowUsserModel> checkfolloweds(int id,int userid);
	@Query(value=" insert \r\n"
			+ "    into\r\n"
			+ "        [userfollowstore]\r\n"
			+ "        (\r\n"
			+ "            is_deleted, storeid, userid\r\n"
			+ "        ) \r\n"
			+ "    values\r\n"
			+ "        ( ?1, ?2, ?3) ",nativeQuery = true)
	public FollowUsserModel Save(Boolean isdelete,int id,int userid);
	@Query(value="Delete from userfollowstore where id=?  ",nativeQuery = true)
	public void delete(int id);
	
}
