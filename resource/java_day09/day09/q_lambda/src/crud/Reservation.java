package crud;

public class Reservation {
	
	private int reservationId;
	private String movieTitle;
	private String customerName;
	private int seatNumber;
	
	
	public Reservation(int reservationId, String movieTitle, String customerName, int seatNumber) {
		super();
		this.reservationId = reservationId;
		this.movieTitle = movieTitle;
		this.customerName = customerName;
		this.seatNumber = seatNumber;
	}


	public int getReservationId() {
		return reservationId;
	}


	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
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
		return "Reservation [reservationId=" + reservationId + ", movieTitle=" + movieTitle + ", customerName="
				+ customerName + ", seatNumber=" + seatNumber + "]";
	}
	
	
	
	
	

}
