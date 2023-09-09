package ir.ac.guilan;

import java.util.ArrayList;

public class Group {

	public static ArrayList<Group> list = new ArrayList<Group>();//this is a array list of groups

	private String gpName;
	private Contact contact;

	public Group() {

	}

	public Group(String gpName) {//this constructor make group without contact
		this.gpName = gpName;
	
	}
	public void removeGpname(int i) {
		list.remove(i);
	}

	public Group(String gpName, Contact contact) {
		
		this.gpName = gpName;
		this.contact=contact;
		
	}

	public static void add(Group gp) {
		list.add(gp);
	}
	public int members() {
		return list.size();
	}
	
	
	

	public void edit(int i, String s) {//edit group's name
		
		AddressBook.contactlist.get(i).group=s;
		list.get(i).gpName = s;
		
	}
	public void remove(int i) {//removing groups and make them unsigned
	
		edit(i,"unasigned");
	}

	public int membrsOfGp(String name) {//this method show members of each group
		int counter = 0;
		for (int i = 0; i < list.size(); i++)
		if (list.get(i).gpName.equals(name))
		counter++;	
		return counter;
	}
	public String getName() {
		return gpName;
	}
	public String showGroup(int i) {
		
		return list.get(i).gpName;
	}
	public Contact getContact() {
		return contact;
	}
	public String getContactName(int i){
		return list.get(i).contact.getName();
	}
	
	
	
	
}
