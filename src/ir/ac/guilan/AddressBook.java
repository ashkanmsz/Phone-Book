package ir.ac.guilan;

import java.util.ArrayList;

public class AddressBook {

	public static ArrayList<Contact> contactlist = new ArrayList<Contact>();// this is array list of contacts

	public static void add(Contact contact) {
		contactlist.add(contact);
	}

	public int getMembers() {
		return contactlist.size();
	}

	public void remove(int i) {
		contactlist.remove(i);
		Group.list.remove(i);
	}

	public void removeAll() {
		contactlist.clear();
		Group.list.clear();
		Location.loacations.clear();
	}

	
}
