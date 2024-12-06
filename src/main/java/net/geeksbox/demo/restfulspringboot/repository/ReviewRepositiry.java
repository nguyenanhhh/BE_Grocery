package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.CartEnity;
import net.geeksbox.demo.restfulspringboot.model.Review;
import net.geeksbox.demo.restfulspringboot.model.ReviewModel;
import net.geeksbox.demo.restfulspringboot.model.User;

public interface ReviewRepositiry extends JpaRepository<Review, Integer> {
	@Query(value="select * from [Review] where orderID=?1 and userID=?2 ",nativeQuery = true)
	public List<Review> checkdadanhgia(int orderID,int userID);
	
}

