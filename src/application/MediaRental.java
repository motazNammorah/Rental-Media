
package application;

import java.util.ArrayList;
import java.util.Collections;


public class MediaRental implements MediaRentalInt {
	protected int value;
	static ArrayList<Customer> customer = new ArrayList<>();
	static ArrayList<Media> media = new ArrayList<>();

	@Override
	public void addCustomer(String name, String address, String plan,String id,String mobileNumber) {

customer.add(new Customer(name, address, plan,id,mobileNumber));

	}

	@Override
	public void addMovie(String title, int copiesAvailable, String rating,String code) {
		media.add(new Movie(title,copiesAvailable,rating,code));

	}

	@Override
	public void addGame(String title, int copiesAvailable, double weigh,String code) {
		media.add(new Game(title, copiesAvailable, weigh,code));
	}

	@Override
	public void addAlbum(String title, int copiesAvailable, String artist, String song,String code) {
		media.add(new Album(title, copiesAvailable, song, artist,code));
	}

	@Override
	public void setLimitedPlanLimit(int value) {
		this.value = value;
	}

	@Override
	public String getAllCustomersInfo() {
		String s="";
		Collections.sort(customer);
		for(int i=0;i<customer.size();i++) {
			s+=customer.get(i).toString()+" \n";
		}
		return  s;
	}

	@Override
	public String getAllMediaInfo() {
		String m="";
		for(int i=0;i<media.size();i++) {
			m+=media.get(i).toString();
		}
		return m;
	}

	@Override
	public boolean addToCart(String customerName, String mediaTitle) {
		int isExit=findIndex(mediaTitle);
		if(isExit==0) {
			customer.get(isExit).interested.add(mediaTitle);
			return true;
		}
		else
		{
			
			return false;
			
		}
	}
	public int findIndex(String nameCastemer) {
		int h=0;
		for(int i=0;i<customer.size();i++) {
			for(int j=0;j<customer.get(i).interested.size();j++) {
				
				if(customer.get(i).interested.get(j).equals(nameCastemer)) {
				h=i;
				}
			}
		}
		return h;
	}
	

	@Override
	public boolean removeFromCart(String customerName, String mediaTitle) {
		int a=-4;
		for(int i=0;i<customer.size();i++) {
			if(customer.get(i).getName().compareTo(customerName)==0) {
				a=i;
			}
		}
		if(a==-4) {
			return false;
		}
		else 
		{
			for(int i=0;i<customer.size();i++) {
				for(int j=0;j<customer.get(i).interested.size();j++) {
					if(customer.get(i).interested.get(j).compareTo(mediaTitle)==0) {
						customer.get(i).interested.remove(mediaTitle);
						return true;
						
					}
				}
			}
				
		
		}
		return false;
	}

	@Override
	public String processRequests() {
		String PrR="";
		for(int  i=0;i<customer.size();i++) {
			if(customer.get(i).getPlan().compareTo("limited")==0) {
				for(int j=0;j<customer.get(i).rented.size();j++) {
					for(int k=0;k<media.size();k++) {
						if(customer.get(i).interested.get(j).compareTo(media.get(k).getTitle())==0) {
							customer.get(i).interested.remove(media.get(k).getTitle());
							customer.get(i).rented.add(media.get(k).getTitle());
							PrR+=" title is : "  + media.get(k).getTitle();
							break;
						}
					}
				}
			}
			else if(customer.get(i).getPlan().toLowerCase().compareTo("unlimited".toLowerCase())==0) {
				for(int j=0;j<customer.get(i).interested.size();j++) {
					for(int k=0;k<media.size();k++) {
						if(customer.get(i).interested.get(j).compareTo(media.get(k).getTitle())==0) {
							customer.get(i).interested.remove(media.get(k).getTitle());
							customer.get(i).rented.add(media.get(k).getTitle());
							PrR+=" title is : "  + media.get(k).getTitle();
							break;
						}
					}
					
				}
			}
		}
		return PrR;
	}

	@Override
	public boolean returnMedia(String customerName, String mediaTitle) {
		for(int i=0;i<customer.size();i++) {
			if(customer.get(i).getName().compareTo(customerName)==0) {
				for(int j=0;j<customer.get(i).rented.size();j++) {
					if(customer.get(i).rented.get(j).compareTo(mediaTitle)==0) {
						customer.get(i).rented.remove(mediaTitle);
						return true;
						
					}
				}
			}
		}
		return false;
	}


	@Override
	public ArrayList<String> searchMedia(String title, String rating, String artist, String songs) {
	
		ArrayList<String> arrays=new ArrayList<>();
		if(title==null&&rating==null&&artist==null&&songs==null) {
			for(int i=0;i<media.size();i++) {
				 arrays.add(media.get(i).getTitle());
			}
			
		}
		else 
		{
			for(int i=0;i<media.size();i++) {
				if((media.get(i).getTitle().compareTo(title))==0){
					if(media.get(i) instanceof Album) {
						for(int j=0;j<media.size();j++) {
							if(((Album)media.get(j)).getArtist().compareTo(artist)==0) {
								 arrays.add(artist);
								 arrays.add(title);
								break;
							}
						}
						for(int f=0;f<media.size();f++) {
							if(((Album)media.get(f)).getSongs().compareTo(songs)==0) {
								 arrays.add(songs);
								 arrays.add(title);
								break;
							}
						}
					}
					else if(media.get(i) instanceof Movie) {
						
						for(int j=0;j<media.size();j++) {
							if(((Movie)media.get(j)).getRating().compareTo(rating)==0) {
								 arrays.add(rating);
								 arrays.add(title);
								break;
							}
						}
					}
				}
				
			}
		}
		return  arrays;
	}
		
		
	}
	

