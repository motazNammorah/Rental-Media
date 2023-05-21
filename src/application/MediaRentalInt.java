

package application;

import java.util.ArrayList;

public interface MediaRentalInt {
	public void addCustomer(String name,String address,String plan,String id,String mobileNumber);
	public void addMovie(String title, int copiesAvailable,String rating,String code);
	public void addGame(String title, int copiesAvailable,double weigh,String code);
	public void addAlbum(String title,int copiesAvailable,String artist,String song,String code);
	public void setLimitedPlanLimit(int value);
	public String getAllCustomersInfo();
	public String getAllMediaInfo();
	public boolean addToCart(String customerName,String mediaTitle);
	public boolean removeFromCart(String customerName, String mediaTitle);
	public String processRequests();
	public boolean returnMedia(String customerName,String mediaTitle);
	public ArrayList<String> searchMedia(String title,String rating, String artist,String songs);


}
