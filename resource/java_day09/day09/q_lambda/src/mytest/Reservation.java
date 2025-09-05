package mytest;

public class Reservation {
	
	private String movieTitle;
	private int theaterNumber;
	private int seatNumber;
	
	
	public Reservation(String movieTitle, int theaterNumber, int seatNumber) {
		super();
		this.movieTitle = movieTitle;
		this.theaterNumber = theaterNumber;
		this.seatNumber = seatNumber;
	}


	public String getMovieTitle() {
		return movieTitle;
	}


	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}


	public int getTheaterNumber() {
		return theaterNumber;
	}


	public void setTheaterNumber(int theaterNumber) {
		this.theaterNumber = theaterNumber;
	}


	public int getSeatNumber() {
		return seatNumber;
	}


	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}


	@Override
	public String toString() {
		return "ReservationManager [movieTitle=" + movieTitle + ", theaterNumber=" + theaterNumber + ", seatNumber="
				+ seatNumber + "]";
	}
	
	
	
	
	

}
