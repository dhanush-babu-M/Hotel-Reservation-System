package org.example.hotel.repository;

import org.example.hotel.model.Hotel;
import java.util.ArrayList;
import java.util.List;

public class HotelRepository {
    private List<Hotel> hotels = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public List<Hotel> getAllHotels() {
        return hotels;
    }

    public Hotel getHotelById(int id) {
        for (Hotel hotel : hotels) {
            if (hotel.getId() == id) {
                return hotel;
            }
        }
        return null;
    }
}
