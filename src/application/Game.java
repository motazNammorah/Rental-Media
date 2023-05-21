
package application;


public class Game extends Media implements Comparable<Game> {

	protected double weight;
	protected  String theCode;
	public Game() {
		super();
	}

	public Game(String titel, int copiesAvailable, double weight,String theCode) {
		super(titel,copiesAvailable);
		this.weight = weight;
		this.theCode=theCode;
		
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

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeigh(double weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Game o) {
		if(this.weight-(o.weight)>0) {
			return 1;
		}
		else if(this.getWeight()-o.getWeight()<0) {
			return -1;
		}
		else 
		{
			return 0;
		}

}

	@Override
	public String toString() {
		return "Game [weight=" + weight + ", theCode=" + theCode + ", title=" + title + ", copiesAvailable="
				+ copiesAvailable + "]";
	}


	
	
}