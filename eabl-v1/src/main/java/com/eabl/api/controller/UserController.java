package com.eabl.api.controller;

import java.io.InvalidObjectException;
import java.util.List;

import com.eabl.api.service.UserService;
import com.eabl.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/eabl")
public class UserController {
	
	@Autowired
	UserService servo;
	
	
	
//	save all users
	@PostMapping(value="/saveall", consumes={"application/xml", "application/json", "*/*"})
	public List<User> saveUsers(@RequestBody List<User> users) throws InvalidObjectException {

		List<User> userz;

		try {
			userz = servo.saveUsers(users);
		}catch (Exception e){
			throw new InvalidObjectException ("The format or type to save is not valid!!!" + e);
		}



		return userz;
		
	}
	
	
	
//	save a single user
	@PostMapping(value="/save", consumes={"*/*",  "application/xml", "application/json", "*/*"})
	public User saveUser(@RequestBody User user) {
		
		return servo.saveUser(user);
	}

//	list all users
	@RequestMapping("/users")
	public List<User> listUsers() {
		return servo.listUsers();
	}
	
//	list a single user
	@GetMapping("/user/{id}")
	public User listUser(@PathVariable String id) {

		return servo.listUser(id);
	}
	
//	delete a user
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable String id) {
		String deletedfName = servo.listUser(id).getfName() ;
		String deletedId = servo.listUser(id).getId() ;
		String deletedlName = servo.listUser(id).getlName() ;
		
		servo.deleteUser(id);
		
		return deletedId+ ": " + deletedfName + ": " + deletedlName +  " deleted successfully";
	}
	

//	delete all users
	@DeleteMapping("/deleteall")
	public String deleteUser() {
		
		servo.deleteAllUsers();
		
		return   "All users deleted successfully";
	}
	
//	update user
	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable String id, @RequestBody User receivedUser) {
		
		
		User toBeUpdated = new User();

		toBeUpdated.setId(id);
		toBeUpdated.setfName(receivedUser.getfName());
		toBeUpdated.setlName(receivedUser.getlName());
		toBeUpdated.setTelNo(receivedUser.getTelNo());
		toBeUpdated.setBusinessNo(receivedUser.getBusinessNo());
		toBeUpdated.setPoints(receivedUser.getPoints());
		
		
		User updatedUser =servo.updateUser(toBeUpdated);


		return updatedUser;
	}
	
	
}
