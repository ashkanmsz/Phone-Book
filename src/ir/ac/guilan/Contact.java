package ir.ac.guilan;

import java.util.ArrayList;

public class Contact {
	/**
	 * the fields of contact class
	 */
	private String name;
	private String number;
	private String birthdate;
	public String location;
	private String gender;
	private String email;
	public String group;
	public static ArrayList<String> names = new ArrayList<String>();// this is a array list for keeping same gps in a
																	// place
	public static ArrayList<String> contactnames = new ArrayList<String>();// this is a array list for keeping
																			// neighbours in a place

	public Contact() {

	}

	public Contact(String name, String number, String birthdate, String location, String gender, String email,
			String group) {
		this.name = name;
		this.number = number;
		this.birthdate = birthdate;
		this.location = location;
		this.gender = gender;
		this.email = email;
		this.group = group;

	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	/**
	 * these are methods of editing section
	 * 
	 * 
	 */
	public void editname(int i, String name) {
		AddressBook.contactlist.get(i).name = name;
	}

	public void editgender(int i, String gender) {
		AddressBook.contactlist.get(i).gender = gender;
	}

	public void editbirth(int i, String birth) {
		AddressBook.contactlist.get(i).birthdate = birth;
	}

	public void editemail(int i, String email) {
		AddressBook.contactlist.get(i).email = email;
	}

	public void editnumber(int i, String number) {
		AddressBook.contactlist.get(i).number = number;
	}

	public void findSameGp(Contact contact) {// this mehtod is for finding same contacts of groups

		for (int i = 0; i < Group.list.size(); i++)
			if (Group.list.get(i).getName().equals(contact.group)&& !Group.list.get(i).getContact().name.equals(contact.name))
				names.add(Group.list.get(i).getContact().name);

	}

	public void findNeighbours(Contact contact) {// this method is for finding neighbours
		for (int i = 0; i < AddressBook.contactlist.size(); i++)
			if (Location.diagnoseNeighbour(contact, AddressBook.contactlist.get(i))
					&& !AddressBook.contactlist.get(i).name.equals(contact.name))
				contactnames.add(AddressBook.contactlist.get(i).name);
	}

}
