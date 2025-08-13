package org.example.hotel.service;

import org.example.hotel.model.Hotel;
import org.example.hotel.repository.HotelRepository;
import java.util.List;

public class HotelService {
    private HotelRepository hotelRepository = new HotelRepository();

    public void addHotel(Hotel hotel) {
        hotelRepository.addHotel(hotel);
    }

    public List<Hotel> getAllHotels() {
        return hotelRepository.getAllHotels();
    }

    public Hotel getHotelById(int id) {
        return hotelRepository.getHotelById(id);
    }
}
