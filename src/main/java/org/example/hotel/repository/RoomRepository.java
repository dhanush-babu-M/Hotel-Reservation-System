package org.example.hotel.repository;

import org.example.hotel.model.Room;
import java.util.ArrayList;
import java.util.List;

public class RoomRepository {
    private List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getAllRooms() {
        return rooms;
    }

    public Room getRoomById(int id) {
        for (Room room : rooms) {
            if (room.getId() == id) {
                return room;
            }
        }
        return null;
    }
}
