package com.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.restaurant.entities.Users;
import com.restaurant.exception.UserNotFoundException;

public interface UsersService {


	
	public  List<Users> getUsers();
	public Users getUsersById(int user_id);
	public Users addUser(Users users);
    public Users updateUser(Users users);
    public void deleteUserById(int user_id);
    public Users getUserByEmail(String email) throws UserNotFoundException;
	
}
