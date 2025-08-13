package org.example.hotel.service;

import org.example.hotel.model.Reservation;
import org.example.hotel.repository.ReservationRepository;
import java.util.List;

public class ReservationService {
    private ReservationRepository reservationRepository = new ReservationRepository();

    public void addReservation(Reservation reservation) {
        reservationRepository.addReservation(reservation);
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.getAllReservations();
    }

    public Reservation getReservationById(int id) {
        return reservationRepository.getReservationById(id);
    }
}
