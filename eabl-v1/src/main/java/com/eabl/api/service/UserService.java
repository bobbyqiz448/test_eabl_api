package com.eabl.api.service;

import java.util.List;

import com.eabl.api.model.User;
import com.eabl.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
//	get users
	public List<User> listUsers(){
		List<User> foundUsers = repo.findAll();
		
		return foundUsers;
	}
	
//	get user
	public User listUser(String id) {
		User foundUser = repo.findById(id).get();
		
		return foundUser;
	}
	
	
//	save user
	public User saveUser(User user) {
//		System.out.println("Requesting to save user, "+ product.toString());
//		User bob = new User("Bob", 13220);
		return repo.save(user);
	}
	
//	save users
	public List<User> saveUsers(List<User> users) {
		return repo.saveAll(users);
	}
	
	
//	delete user
	public void deleteUser(String id) {
		repo.deleteById(id) ;
	}
	
//	delete all users
	public void deleteAllUsers() {
		repo.deleteAll();
	}
	
	
//	update user
	public User updateUser(User user) {
		
		User existingUser = repo.findById(user.getId()).orElse(null);

		existingUser.setId(user.getId());
		existingUser.setlName(user.getlName());
		existingUser.setfName(user.getfName());
		existingUser.setTelNo(user.getTelNo());
		existingUser.setBusinessNo(user.getBusinessNo());
		existingUser.setPoints(user.getPoints());


		return repo.save(existingUser);
	}
	
	
	
}
