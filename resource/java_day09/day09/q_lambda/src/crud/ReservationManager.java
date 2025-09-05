package crud;

import java.util.ArrayList;

public class ReservationManager {
	
	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	
//	1. 예매 추가 (같은 좌석번호와 영화제목이 이미 존재하면 추가 불가) - 중복 체크 
	public void addReservation(Reservation reservation) {
		for (Reservation r : reservations) {
			if(r.getMovieTitle().equals(r.getMovieTitle()) && r.getSeatNumber() == r.getSeatNumber()) {
				System.out.println("이미 예매된 좌석입니다. (" + r.getMovieTitle() + " - 좌석" + r.getSeatNumber() + ")");
				return ;
				
			}
			
		}
		reservations.add(reservation);
		System.out.println("예매 완료");
	}
	
	
	
	
//	2. 예매 전체 조회 (모든 예매 출력)
	public void showAllReservations() {
		if(reservations.isEmpty()) {
			System.out.println("예매된 좌석이 없습니다.");
			return;
			
		}
		for (Reservation r : reservations) {
			System.out.println(r);
			
		}
	}
	
	
	
	
//	3. 예매 검색(예약 ID)
	
	public Reservation findReservationById(int reservationId) {
		for (Reservation r : reservations) {
			if (r.getReservationId() == reservationId) {
				return r;
			}
		}
		return null;
	}
	
	
	
	
	
//    4. 예매 취소 
	
	public boolean cancelReservation(int reservationId) {
		Reservation r = findReservationById(reservationId);
		if (r != null) {
			reservations.remove(r);
			System.out.println("예매 취소 완료");
			return true;
		}
		System.out.println("해당 ID의 예매가 없습니다.");
		return false;
	}
	
	
	
	
	
//    5. 좌석 변경 (영화 제목과 좌석 번호가 중복되지 않아야 변경 가능)
	
		public boolean updateSeat(int reservationId, int newSeatNumber) {
			Reservation r = findReservationById(reservationId);
			
			if(r == null) {
				System.out.println("해당 ID의 예매가 없습니다.");
				return false;
			}
			
			for (Reservation other : reservations) {
				if(!other.equals(r) && other.getMovieTitle().equals(r.getMovieTitle()) && other.getSeatNumber() == newSeatNumber) {
					System.out.println("변경할 죄석은 이미 예약되어 있습니다.");
					return false;
				}
			}
			
			r.setSeatNumber(newSeatNumber);
			System.out.println("좌석 변경 완료");
			return true;
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
