package entity;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;

/*** This class is the management of the ingredient data in the Menu
* @author Qizhou Zhang
* @version 0.5
*/
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
	/**
	   * Constructor, read csv data here
	   * @return none
	   */	
		readMenu();
	}
	//Read CSV file
	public void readMenu() {
	/**
	   * Get the value of the variable from CSV
	   * @return none
	   */
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
	/**
	   * Store the data in CSV
	   * @return none
	   */
		DataProcessor data = new DataProcessor("data/material.csv");
		ArrayList<String> outPutMenu = new ArrayList<String>(); 
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
	/**
	   * Get the noodles price 
	   * @return the number of noodle price in double
	   */	
		return noodlePrice;
	}
	//read noriPrice
	public  double getnoriPrice(){
	/**
	   * Get the nori price 
	  * @return the number of nori price in double
	   */	
		return noriPrice;
	}
	//read eggPrice
	public  double geteggPrice(){
	/**
	   * Get the egg price 
	  * @return the number of egg price in double
	   */		
		return eggPrice;
	}
	//read bambooPrice
	public  double getbambooPrice(){
	/**
	   * Get the bamboo price 
	   * @return the number of bamboo price in double
	   */		
		return bambooPrice;
	}
	//read chashuPrice
	public  double getchashuPrice(){
	/**
	   * Get the chashu price 
	   * @return the number of chashu price in double
	   */			
		return chashuPrice;
	}
	//read noriAvailable
	public int getnoriAvailable(){
	/**
	   * Get the nori available
	   * @return the number of nori available in int
	   */
		return noriAvailable;
	}
	//read eggAvailable
	public int geteggAvailable(){
	/**
	   * Get the egg available
	   * @return the number of egg available in int
	   */	
		return eggAvailable;
	}
	//read bambooAvailable
	public int getbambooAvailable(){
	/**
	   * Get the bamboo available
	   * @return the number of bamboo available in int
	   */	
		return bambooAvailable;
	}
	//read chashuAvailable
	public int getchashuAvailable(){
	/**
	   * Get the chashu available
	   * @return the number of chashu available in int
	   */	
		return chashuAvailable;
	}
	//Modify noodlePrice
	public void setnoodlePrice(double noodlePrice) { 
	/**
	   * update the price of noodle
	   * @param new price of noodle
	   * @return none
	   */	
		this.noodlePrice = noodlePrice;
	}
	//Modify noriPrice
	public void setnoriPrice(double noriPrice) { 
	/**
	   * update the price of nori
	   * @param new price of nori
	   * @return none
	   */	
		this.noriPrice = noriPrice;
	}
	//Modify eggPrice
	public void seteggPrice(double eggPrice) { 
	/**
	   * update the price of egg
	   * @param new price of egg
	   * @return none
	   */	
		this.eggPrice = eggPrice;
	}
	//Modify bambooPrice
	public void setbambooPrice(double bambooPrice) { 
	/**
	   * update the price of bamboo
	   * @param new price of bamboo
	   * @return none
	   */	
		this.bambooPrice = bambooPrice;
	}
	//Modify chashuPrice
	public void setchashuPrice(double chashuPrice) { 
	/**
	   * update the price of chashu
	   * @param new price of chashu
	   * @return none
	   */	
		this.chashuPrice = chashuPrice;
	}
	//Modify noriAvailable
	public void setnoriAvailable(int noriAvailable) { 
	/**
	   * update the available of nori
	   * @param new available of nori
	   * @return none
	   */	
		this.noriAvailable = noriAvailable;
	}
	//Modify eggAvailable
	public void seteggAvailable(int eggAvailable) {
	/**
	   * update the available of egg
	   * @param new available of egg
	   * @return none
	   */	 
		this.eggAvailable = eggAvailable;
	}
	//Modify bambooAvailable

	public void setbambooAvailable(int bambooAvailable) { 
	/**
	   * update the available of bamboo
	   * @param new available of bamboo
	   * @return none
	   */		
		this.bambooAvailable = bambooAvailable;
	}
	//Modify chashuAvailable
	public void setchashuAvailable(int chashuAvailable) { 
	/**
	   * update the available of chashu
	   * @param new available of chashu
	   * @return none
	   */		
		this.chashuAvailable = chashuAvailable;
	}
	

	public static void main(String[] args) {
		// Usage Example
		OrderMenu om = new OrderMenu();
		om.setbambooAvailable(5);
		om.writeMenu();
	}

}
