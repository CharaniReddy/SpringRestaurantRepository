package com.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.entities.Users;

import com.restaurant.service.UsersService;

@RestController
public class UserController {

	@Autowired
	private UsersService usersService;
	@GetMapping("/users")
	public List<Users> getUsers(){
		return this.usersService.getUsers();
	}
	@PutMapping("/users")
	public Users updateUser(@RequestBody Users users) {
		return this.usersService.updateUser(users);
	}
	@GetMapping("/users/{userid}")
	public Users getUsersById(@PathVariable int user_id) {
		return this.usersService.getUsersById(user_id);
	}
	@PostMapping("/users")
	public Users addUser(@RequestBody Users users) {
		return this.usersService.addUser(users);
	}
	@DeleteMapping("/users/{userid}")
	public void deleteUserById(@PathVariable int user_id) {
		 this.usersService.deleteUserById(user_id);
	}
	@RequestMapping(value = "/user/{email}", method = RequestMethod.PUT)
	   public ResponseEntity getByEmail(@PathVariable("email") String email, @RequestBody Users user) { 
	      
	      return new ResponseEntity(this.usersService.getUserByEmail(email),HttpStatus.OK);
	   }
	
	
}
