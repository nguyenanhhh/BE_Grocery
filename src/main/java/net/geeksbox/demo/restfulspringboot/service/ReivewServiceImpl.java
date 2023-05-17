package net.geeksbox.demo.restfulspringboot.service;

import net.geeksbox.demo.restfulspringboot.model.Product;
import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.ProductRepositiry;
import net.geeksbox.demo.restfulspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import java.util.List;

@Service
public class ReivewServiceImpl implements ReviewService{

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

   

	
    

}
