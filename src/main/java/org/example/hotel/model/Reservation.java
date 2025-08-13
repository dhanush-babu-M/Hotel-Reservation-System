package org.example.hotel.model;

public class Reservation {
    private int id;
    private int hotelId;
    private int roomId;
    private String customerName;

    public Reservation(int id, int hotelId, int roomId, String customerName) {
        this.id = id;
        this.hotelId = hotelId;
        this.roomId = roomId;
        this.customerName = customerName;
    }

    public int getId() {
        return id;
    }

    public int getHotelId() {
        return hotelId;
    }

    public int getRoomId() {
        return roomId;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", hotelId=" + hotelId +
                ", roomId=" + roomId +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}