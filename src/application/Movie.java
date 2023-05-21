

package application;


public class Movie extends Media implements Comparable<Movie> {

	protected String rating;
	protected String theCode;
	

	public Movie(String title, int copiesAvailable, String rating,String theCode) {
		super(title,copiesAvailable);
		this.theCode=theCode;
		this.rating = rating;
	}

	/**
	 * @return the theCode
	 */
	public String getTheCode() {
		return theCode;
	}

	/**
	 * @param theCode the theCode to set
	 */
	public void setTheCode(String theCode) {
		this.theCode = theCode;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public int compareTo(Movie o) {
		if(this.rating.compareTo(o.rating)>0) {
			return 1;
		}
		else if(this.getRating().compareTo(((Movie) o).getRating())<0) {
			return -1;
		}
		else 
		{
			return 0;
		}

}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", theCode=" + theCode + ", title=" + title + ", copiesAvailable="
				+ copiesAvailable + "]";
	}
	

	
}