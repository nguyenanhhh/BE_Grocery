package net.geeksbox.demo.restfulspringboot.service;

import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.ProductOnTop5;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.ProductRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import java.util.List;
import java.util.ArrayList;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepositiry productRepositiry;

	@Override
	public Product update(int id, Product user) {
		 Product fromDB = productRepositiry.findById(id).orElse(null);
	        if (fromDB == null) {
	            return null;
	        }
	        fromDB.setName(user.getName());
	        fromDB.setDescription(user.getDescription());
	        fromDB.setPrice(user.getPrice());
	        fromDB.setSold(user.getSold());
	        fromDB.setImg(user.getImg());
	        fromDB.setCategoryID(user.getCategoryID());
	        fromDB.setCreatedAt(user.getCreatedAt());
	        fromDB.setIsActive(user.getIsActive());
	        fromDB.setQuantity(user.getQuantity());
	        fromDB.setStoreID(user.getStoreID());
	        fromDB.setIsSelling(user.getIsSelling());
	        fromDB.setUpdatedAt(user.getUpdatedAt());

	        return productRepositiry.save(fromDB);
	}

	@Override
	   public List<ProductOnTop5> getTop5ProOfStore(int storeID, int year) {
		   List<Object[]> rss= productRepositiry.top5productOfStore(storeID, year);
		   
		  List<ProductOnTop5> list= new ArrayList<>();
		  for (Object[] rs: rss) {
			  ProductOnTop5 pro = new ProductOnTop5();
			  pro.setProductID((Integer) rs[0]);
			  pro.setCountSold((Integer) rs[3]);
			  pro.setName((String) rs[1]);
			  pro.setImg((String) rs[2]);
			  list.add(pro);
			  
		  }
		   
		   
		   return list;
	   }
    

}
