
package application;

public abstract class Media {
	 protected String title; 
	 protected int copiesAvailable ;
	public Media() {
		
	}
	
   public Media(String title ,int copiesAvailable) {
	   
	   this.copiesAvailable=copiesAvailable ;
		this.title=title;
		
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitel(String title) {
		this.title = title;
	}
	
	public int getCopiesAvailable() {
		return copiesAvailable;
	}
	
	public void setCopiesAvailable(int copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	} 
	 
	 
	 

}
