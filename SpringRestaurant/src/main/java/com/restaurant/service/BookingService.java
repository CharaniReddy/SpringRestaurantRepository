package com.restaurant.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.restaurant.entities.Booking;

@Service
public interface BookingService {
public List<Booking> getBooking();
public Booking getBookingById(int booking_id);
public Booking addBooking(Booking booking);
public void deleteBooking(int booking_id);
public Booking updateBooking(Booking booking);
public Booking findBookingByEmail(String email);
public List<Object> getByEmailid(String email);
}
