package mytest;

import java.util.ArrayList;

public class ReservationManager {
	
	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	

	
    // 1. 예매 추가 (Create)
    // 같은 영화관(theaterNumber)에 같은 좌석(seatNumber)은 중복 불가
	public void addReservation(Reservation reservation) {
		for (Reservation r : reservations) {
			if(r.getTheaterNumber() == reservation.getTheaterNumber() && r.getSeatNumber() == reservation.getSeatNumber()) {
				System.out.println("이미 예약된 좌석입니다.");
				return;
			}
			
		}
		reservations.add(reservation);
		System.out.println("예매가 완료되었습니다.");
	}
	
    // 2. 전체 예매 조회 (Read)
	public void printAll() {
		if(reservations.isEmpty()) {
			System.out.println("예매된 좌석이 없습니다.");
			return;
		}
		for (Reservation r : reservations) {
			System.out.println(r);
		}
		
	}
	
	
	
	
    // 3. 특정 영화 제목으로 예매 수정 (Update)
    // 영화 제목을 기준으로 좌석 변경
	
	public void updateMovie(String movieTitle, int newSeatNumber) {
		for (Reservation r : reservations) {
			if(r.getMovieTitle().equals(movieTitle)) {
				r.setSeatNumber(newSeatNumber);
				System.out.println("좌석이 수정되었습니다.");
				return;
			}
			
		}
		System.out.println("해당 영화 제목의 예매정보를 찾을 수 없습니다.");
		
	}
	
	
	
    // 4. 영화 제목으로 예매 취소 (Delete)
	
	public void deleteMovie(String movieTitle) {
		for (int i = 0; i < reservations.size(); i++) {
			if(reservations.get(i).getMovieTitle().equals(movieTitle)) {
				reservations.remove(i);
				System.out.println("예매가 취소되었습니다.");
				return;
				
			}
		}
		System.out.println("해당 영화의 제목을 찾을 수 없습니다.");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
