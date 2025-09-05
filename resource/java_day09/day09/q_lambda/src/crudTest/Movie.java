package crudTest;

public class Movie {
//	영화 제목, 평점, 출시년도 
	
	private String title;
	private double rating;
	private int year;
	
	public Movie(String title, double rating, int year) {
		super();
		this.title = title;
		this.rating = rating;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", rating=" + rating + ", year=" + year + "]";
	}
	
	
	
	
}
