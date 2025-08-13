package org.example.hotel.app;

import org.example.hotel.model.Hotel;
import org.example.hotel.model.Room;
import org.example.hotel.model.Reservation;
import org.example.hotel.service.HotelService;
import org.example.hotel.service.RoomService;
import org.example.hotel.service.ReservationService;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    private static HotelService hotelService = new HotelService();
    private static RoomService roomService = new RoomService();
    private static ReservationService reservationService = new ReservationService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Hotel Reservation System ---");
            System.out.println("1. Add Hotel");
            System.out.println("2. Add Room");
            System.out.println("3. Make Reservation");
            System.out.println("4. View Hotels");
            System.out.println("5. View Rooms");
            System.out.println("6. View Reservations");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1: addHotel(); break;
                case 2: addRoom(); break;
                case 3: makeReservation(); break;
                case 4: viewHotels(); break;
                case 5: viewRooms(); break;
                case 6: viewReservations(); break;
                case 0: System.exit(0); break;
                default: System.out.println("Invalid option!");
            }
        }
    }

    private static void addHotel() {
        System.out.print("Enter Hotel ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Hotel Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Hotel Location: ");
        String location = scanner.nextLine();

        hotelService.addHotel(new Hotel(id, name, location));
        System.out.println("Hotel added successfully!");
    }

    private static void addRoom() {
        System.out.print("Enter Room ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Room Type: ");
        String type = scanner.nextLine();
        System.out.print("Enter Room Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Hotel ID for this room: ");
        int hotelId = scanner.nextInt();
        scanner.nextLine();

        roomService.addRoom(new Room(id, type, price, hotelId));
        System.out.println("Room added successfully!");
    }

    private static void makeReservation() {
        System.out.print("Enter Reservation ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Hotel ID: ");
        int hotelId = scanner.nextInt();
        System.out.print("Enter Room ID: ");
        int roomId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();

        reservationService.addReservation(new Reservation(id, hotelId, roomId, name));
        System.out.println("Reservation made successfully!");
    }

    private static void viewHotels() {
        List<Hotel> hotels = hotelService.getAllHotels();
        hotels.forEach(System.out::println);
    }

    private static void viewRooms() {
        List<Room> rooms = roomService.getAllRooms();
        rooms.forEach(System.out::println);
    }

    private static void viewReservations() {
        List<Reservation> reservations = reservationService.getAllReservations();
        reservations.forEach(System.out::println);
    }
}
