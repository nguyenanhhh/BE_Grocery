package net.geeksbox.demo.restfulspringboot.service;

import net.geeksbox.demo.restfulspringboot.model.User;
import net.geeksbox.demo.restfulspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

	@Override
	public User checkAccount(String email, String password) {
		// TODO Auto-generated method stub
		return userRepository.checkAccount(email, password);
	}

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(int id, User user) {
		 User fromDB = userRepository.findById(id).orElse(null);
	        if (fromDB == null) {
	            return null;
	        }
	        fromDB.setAvatar(user.getAvatar());
	        fromDB.setHash_password(user.getHash_password());
	        fromDB.setPhone(user.getPhone());
	        fromDB.setPoint(user.getPoint());
	        fromDB.setRole(user.getRole());
	        fromDB.setEmail(user.getEmail());
	        fromDB.setName(user.getName());
	        fromDB.setSalt(user.getSalt());
	        return userRepository.save(fromDB);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User dangky(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User kiemtraemail(String emai) {
		// TODO Auto-generated method stub
		return userRepository.kiemtraemail(emai);
	}

	@Override
	public User kiemtraphone(String phone) {
		// TODO Auto-generated method stub
		return userRepository.kiemtraphone(phone);
	}

	@Override
	public List<User> danhsachshipper() {
		// TODO Auto-generated method stub
		return userRepository.danhsachshipper();
	}
    

}
