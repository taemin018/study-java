package crudTest;

import java.util.ArrayList;

public class ReservationManager {

    private ArrayList<Reservation> reservations = new ArrayList<>();

    // 1. 예매 추가
    public void addReservation(Reservation reservaion) {
        for (Reservation reservation : reservations) {
            if (reservation.getMovieTitle().equals(reservaion.getMovieTitle())
                    && reservation.getSeatNumber() == reservaion.getSeatNumber()) {
                System.out.println("이미 예매된 좌석입니다.");
                return;
            }
        }
        reservations.add(reservaion);
        System.out.println("예매 완료");
    }

    // 2. 예매 전체 조회
    public void showAllReservations() {
        if (reservations.isEmpty()) {
            System.out.println("예매된 좌석이 없습니다.");
            return;
        }
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }

    // 3. 예약 ID로 예매 검색
    public Reservation findReservationById(int reservationID) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationID() == reservationID) {
                return reservation;
            }
        }
        return null;
    }

    // 4. 예매 취소
    public boolean cancelReservation(int reservationID) {
        Reservation reservation = findReservationById(reservationID);
        if (reservation != null) {
            reservations.remove(reservation);
            System.out.println("예매 취소 완료");
            return true;
        }
        System.out.println("해당 ID의 예매가 없습니다.");
        return false;
    }
}
