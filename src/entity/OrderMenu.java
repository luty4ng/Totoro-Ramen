package entity;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class OrderMenu {

	private double noodlePrice;
	private double noriPrice;
	private double eggPrice;
	private double bambooPrice;
	private double chashuPrice;
	private int noriAvailable;
	private int eggAvailable;
	private int bambooAvailable;
	private int chashuAvailable;
	
	//Pass the data in the file into a variable
	public OrderMenu() {
		readMenu();
	}
	//Read CSV file
	public void readMenu() {
		DataProcessor data = new DataProcessor("data/material.csv");
		String[] meterial = data.Read().get(0).split(",");
		this.noodlePrice = Double.parseDouble(meterial[0]);
		this.noriPrice = Double.parseDouble(meterial[1]);
		this.eggPrice = Double.parseDouble(meterial[2]);
		this.bambooPrice = Double.parseDouble(meterial[3]);
		this.chashuPrice = Double.parseDouble(meterial[4]);
		this.noriAvailable = Integer.parseInt(meterial[5]);
		this.eggAvailable = Integer.parseInt(meterial[6]);
		this.bambooAvailable = Integer.parseInt(meterial[7]);
		this.chashuAvailable = Integer.parseInt(meterial[8]);
	}
	//write CSV file
	public void writeMenu() {
		DataProcessor data = new DataProcessor("data/material.csv");
		ArrayList<String> outPutMenu = new ArrayList<String>(); 
		outPutMenu.add("noodlePrice,noriPrice,"
				     + "eggPrice,bambooPrice,chashuPrice,"
				     + "noriAvailable,eggAvailable,bambooAvailable,"
				     + "chashuAvailable");
		outPutMenu.add("" + this.noodlePrice + ","
						  + this.noriPrice + ","
						  + this.eggPrice + ","
						  + this.bambooPrice + ","
						  + this.chashuPrice + ","
						  + this.noriAvailable + ","
						  + this.eggAvailable + ","
						  + this.bambooAvailable + ","
						  + this.chashuAvailable + ",");
		data.Write(outPutMenu);
	}
	//read noodlePrice
	public  double getnoodlePrice(){
		return noodlePrice;
	}
	//read noriPrice
	public  double getnoriPrice(){
		return noriPrice;
	}
	//read eggPrice
	public  double geteggPrice(){
		return eggPrice;
	}
	//read bambooPrice
	public  double getbambooPrice(){
		return bambooPrice;
	}
	//read chashuPrice
	public  double getchashuPrice(){
		return chashuPrice;
	}
	//read noriAvailable
	public int getnoriAvailable(){
		return noriAvailable;
	}
	//read eggAvailable
	public int geteggAvailable(){
		return eggAvailable;
	}
	//read bambooAvailable
	public int getbambooAvailable(){
		return bambooAvailable;
	}
	//read chashuAvailable
	public int getchashuAvailable(){
		return chashuAvailable;
	}
	//Modify noodlePrice
	public void setnoodlePrice(double noodlePrice) { 
		this.noodlePrice = noodlePrice;
	}
	//Modify noriPrice
	public void setnoriPrice(double noriPrice) { 
		this.noriPrice = noriPrice;
	}
	//Modify eggPrice
	public void seteggPrice(double eggPrice) { 
		this.eggPrice = eggPrice;
	}
	//Modify bambooPrice
	public void setbambooPrice(double bambooPrice) { 
		this.bambooPrice = bambooPrice;
	}
	//Modify chashuPrice
	public void setchashuPrice(double chashuPrice) { 
		this.chashuPrice = chashuPrice;
	}
	//Modify noriAvailable
	public void setnoriAvailable(int noriAvailable) { 
		this.noriAvailable = noriAvailable;
	}
	//Modify eggAvailable
	public void seteggAvailable(int eggAvailable) { 
		this.eggAvailable = eggAvailable;
	}
	//Modify bambooAvailable

	public void setbambooAvailable(int bambooAvailable) { 
		this.bambooAvailable = bambooAvailable;
	}
	//Modify chashuAvailable
	public void setchashuAvailable(int chashuAvailable) { 
		this.chashuAvailable = chashuAvailable;
	}
	public static void main(String[] args) {
		// Usage Example
		OrderMenu om = new OrderMenu();
		om.setbambooAvailable(5);
		om.writeMenu();
	}

}
