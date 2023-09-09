package ir.ac.guilan;

import java.util.ArrayList;

public class Location {

	private String x;
	private String y;
	private double r;
	public static ArrayList<String> loacations = new ArrayList<String>();// this is a array list of locations

	public Location() {

	}

	public Location(String x, String y) {// we get the x,y and convert them to integer
		this.x = x;
		this.y = y;
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		double result = Math.pow(x1, 2) + Math.pow(y1, 2);// we calculate the r
		r = (int) Math.sqrt(result);
	}

	public String diagnoseLoc(double r) {// this method indicate the locations
		if (r <= 5) {
			loacations.add("sector");
			
			return "sector";
		} else if (r > 5 && r <= 10) {
			loacations.add("avenue");

			return "avenue";
		} else if (r > 10 && r <= 20) {
			loacations.add("city");

			return "city";
		} else if (r > 20 && r <= 30) {
			loacations.add("country");
			return "country";
		} else
			return "-";
	}

	public double getR() {// get r
		return r;
	}

	public static boolean diagnoseNeighbour(Contact contact, Contact contact1) {// this method dignose that 2 conatcs
																				// are neighbour or not
		if (contact.getLocation().equals(contact1.getLocation()))
			return true;
		return false;
	}

	public int membersOfLocation(String name) {//this mehod indicate members of each location
		int counter = 0;
		for (int i = 0; i < loacations.size(); i++)
			if (loacations.get(i).equals(name))
				counter++;
		return counter;
	}

}
