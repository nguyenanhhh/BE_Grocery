package net.geeksbox.demo.restfulspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.geeksbox.demo.restfulspringboot.model.Cart;
import net.geeksbox.demo.restfulspringboot.model.DonHangModel;
import net.geeksbox.demo.restfulspringboot.model.OrderEnity;
import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.ThongKeModel;
import net.geeksbox.demo.restfulspringboot.model.User;

public interface ThongKeRepositiry extends JpaRepository<ThongKeModel, Integer>  {

	
	 @Query(value="select sum(cost_Sum) as doanhthuthang, MONTH(created_At) as thang from [Order] where  YEAR(created_At)=?1 and storeid=?2 group by MONTH(created_At) order by MONTH(created_At)",nativeQuery = true) 
	 public List<ThongKeModel> getThongKeTheoThang(int year, int id);
	 
}
