

package application;

import java.util.ArrayList;

public class Customer implements Comparable<Customer> {

	protected String name;
	protected String addraes;
	protected String plan;
	protected String mopileNumbner;
	protected String id;
	ArrayList <String> interested=new ArrayList<>();
	ArrayList <String> rented=new ArrayList<>();

	public Customer() {
		super();
	}

	public Customer(String name, String addraes, String plan,String id,String mopileNumber) {
		super();
		this.name = name;
		this.addraes = addraes;
		this.plan = plan;
		this.id=id;
		this.mopileNumbner=mopileNumber;
		interested=new ArrayList<>();
		rented=new ArrayList<>();
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @return the mopileNumbner
	 */
	public String getMopileNumbner() {
		return mopileNumbner;
	}

	/**
	 * @param mopileNumbner the mopileNumbner to set
	 */
	public void setMopileNumbner(String mopileNumbner) {
		this.mopileNumbner = mopileNumbner;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddraes() {
		return addraes;
	}

	public void setAddraes(String addraes) {
		this.addraes = addraes;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	@Override
	public int compareTo(Customer o) {
		if(this.name.compareTo(o.name)>0) {
			return 1;
		}
		else if(this.getName().compareTo(o.getName())<0) {
			return -1;
		}
		else 
		{
			return 0;
		}
	
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", addraes=" + addraes + ", plan=" + plan + "]";
	}
	

}
