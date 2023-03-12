package xmlBased;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Agent {
	private String name;
	private int id;
	private List<Address> address;
	private Set<String> guns;

	private Map<String,Integer> ammunition;

	public Map<String, Integer> getAmmunition() {
		return ammunition;
	}

	public Agent() {
	}


	public Agent(List<Address> address, Set<String> guns, Map<String, Integer> ammunition) {
		this.address = address;
		this.guns = guns;
		this.ammunition = ammunition;
	}

	public void setAmmunition(Map<String, Integer> ammunition) {
		this.ammunition = ammunition;
	}

	public Set<String> getGuns() {
		return guns;
	}

	public void setGuns(Set<String> guns) {
		this.guns = guns;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address =address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Agent{\n Name: "+getName()+"\n Id: "+getId()+"\n Addresses: "+getAddress()+"\n Guns: "+getGuns()+"\n Ammunition: "+getAmmunition()+"\n}";
	}

}
