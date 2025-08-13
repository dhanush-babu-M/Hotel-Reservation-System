package org.example.hotel.model;

public class Room {
    private int id;
    private String type; // Single, Double, Suite
    private double price;
    private int hotelId; // which hotel the room belongs to

    public Room(int id, String type, double price, int hotelId) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.hotelId = hotelId;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getHotelId() {
        return hotelId;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", hotelId=" + hotelId +
                '}';
    }
}
