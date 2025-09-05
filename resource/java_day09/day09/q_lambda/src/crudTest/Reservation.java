package crudTest;

public class Reservation {
//	예매이름
//	영화 제목 
//	고객이름
//	자리 번호 

	private String reservationID;
	private String movieTitle;
	private String customerName;
	private int seatNumber;
	
	
	public Reservation(String reservationID, String movieTitle, String customerName, int seatNumber) {
		super();
		this.reservationID = reservationID;
		this.movieTitle = movieTitle;
		this.customerName = customerName;
		this.seatNumber = seatNumber;
	}


	public String getReservationID() {
		return reservationID;
	}


	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}


	public String getMovieTitle() {
		return movieTitle;
	}


	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getSeatNumber() {
		return seatNumber;
	}


	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}


	@Override
	public String toString() {
		return "Reservation [reservationID=" + reservationID + ", movieTitle=" + movieTitle + ", customerName="
				+ customerName + ", seatNumber=" + seatNumber + "]";
	}
	
	
	
	
	
	
}
