package org.example.hotel.service;

import org.example.hotel.model.Room;
import org.example.hotel.repository.RoomRepository;
import java.util.List;

public class RoomService {
    private RoomRepository roomRepository = new RoomRepository();

    public void addRoom(Room room) {
        roomRepository.addRoom(room);
    }

    public List<Room> getAllRooms() {
        return roomRepository.getAllRooms();
    }

    public Room getRoomById(int id) {
        return roomRepository.getRoomById(id);
    }
}