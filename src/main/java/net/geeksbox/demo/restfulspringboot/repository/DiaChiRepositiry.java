package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.CartEnity;
import net.geeksbox.demo.restfulspringboot.model.Category;
import net.geeksbox.demo.restfulspringboot.model.DiaChiEnity;
import net.geeksbox.demo.restfulspringboot.model.Product;

public interface DiaChiRepositiry extends JpaRepository<DiaChiEnity, Integer> {
	@Query(value="select *from UserDiaChi where userID=? and main='true'",nativeQuery = true)
	public DiaChiEnity getmaindiachi(int id);
	
}
