package com.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restaurant.dao.RestaurantDAO;

import com.restaurant.entities.Restaurant;
import com.restaurant.exception.RestaurantNotFoundException;

@Service
public class RestaurantServiceImpl implements RestaurantService{
@Autowired
private RestaurantDAO  restaurantDAO; 

	@Override
	public List<Restaurant> getRestaurants() {
		// TODO Auto-generated method stub
		return  restaurantDAO.findAll();
	}
	@Override
	public Restaurant getRestaurantByName(String name) throws RestaurantNotFoundException {
		// TODO Auto-generated method stub
		Restaurant restaurant;

		if (restaurantDAO.findByName(name)!=null) {
					restaurant=restaurantDAO.findByName(name);
				}
		else
		{
			throw new RestaurantNotFoundException();
		}
				return restaurant;
			}
			// TODO Auto-generated method stub

	
}
