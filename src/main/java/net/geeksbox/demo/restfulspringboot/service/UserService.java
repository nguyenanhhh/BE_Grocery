package net.geeksbox.demo.restfulspringboot.service;

import net.geeksbox.demo.restfulspringboot.model.CartItem;
import net.geeksbox.demo.restfulspringboot.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    public User checkAccount(String email,String password);
    public User kiemtraemail(String emai);
    public User kiemtraphone(String phone );
    User create(User user);
    User update(int id, User user);
    void delete(int id);
    User findById(int id);
	public User dangky(User user);
	 List<User> danhsachshipper();
    
}

