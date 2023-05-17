package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.CartEnity;
import net.geeksbox.demo.restfulspringboot.model.DiaChiEnity;
import net.geeksbox.demo.restfulspringboot.model.Review;
import net.geeksbox.demo.restfulspringboot.model.ReviewModel;

public interface ReviewModelRepositiry extends JpaRepository<ReviewModel, Integer> {
	@Query(value="select Review.reviewID,Review.orderID,Review.contents,Review.storeID,Review.userID,Review.productID,Review.rating,Users.name,Users.avatar from Review inner join Users on Review.userID=Users.userID where productID=?",nativeQuery = true)
	public List<ReviewModel> getlistdanhgia(int id);
	
}

