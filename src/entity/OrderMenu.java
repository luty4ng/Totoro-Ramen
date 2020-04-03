package entity;
import java.io.*;
import java.lang.*;

public class OrderMenu {

	private static double noodlePrice;
	private static double noriPrice;
	private static double eggPrice;
	private static double bambooPrice;
	private static double chashuPrice;
	private static int noriAvailable;
	private static int eggAvailable;
	private static int bambooAvailable;
	private static int chashuAvailable;
	
	//Pass the data in the file into a variable
	public OrderMenu() {
		String[][] a= new String[10][10];
		a=readCSV();
		noriPrice=Double.parseDouble(a[1][2]);
		eggPrice=Double.parseDouble(a[4][2]);
		bambooPrice=Double.parseDouble(a[2][2]);
		chashuPrice=Double.parseDouble(a[3][2]);
		noriAvailable=Integer.parseInt(a[1][1]);
		eggAvailable=Integer.parseInt(a[4][1]);
		bambooAvailable=Integer.parseInt(a[2][1]);
		chashuAvailable=Integer.parseInt(a[3][1]);

	}
	//Read CSV file
	public String[][] readCSV(){
		int n=0;
		int m;
		String[][] x=new String[10][10];

		File csv = new File("/Users/apple/Desktop/material.csv");
 
		try{
	
			//Reads text from the character input stream, buffers each character, thus achieves the efficient reading.
			BufferedReader textFile = new BufferedReader(new FileReader(csv));
			String[] lineDta = new String[100] ;

			for(m=0;m<100;m++) {
    	lineDta[m]="";
			}
 
			//Assign the next line of data in the document to lineData and determine if it is empty, or output if it is not
			while ((lineDta[n] = textFile.readLine()) != null){
				x[n] = lineDta[n].split(",");
				n++;
			}
			textFile.close();
 
		}catch (FileNotFoundException e){
			System.out.println("NOT FOUND");
		}catch (IOException e){
			System.out.println("ERROR");
		}
		return x;
	}
	//A function that writes data to a CSV file
	public void writemenu(){
		File writeFile = new File("/Users/apple/Desktop/material.csv");
		try{
	        //The BufferedReader class creates a buffered character output stream using the default size output buffer
	        BufferedWriter writeText = new BufferedWriter(new FileWriter(writeFile));

	            //A method to call write writes the string to the stream
	            writeText.write("name,amount,price");
	            writeText.newLine(); 
	            writeText.write("nori,1,2");
	            writeText.newLine(); 
	            writeText.write("bambooshoots,1,2");
	            writeText.newLine(); 
	            writeText.write("chashu,1,2");
	            writeText.newLine(); 
	            writeText.write("boiledEgg,1,2");



	        writeText.flush();
	        writeText.close();
	    	}catch (FileNotFoundException e){
	        System.out.println("NOT FOUND");
	    	}catch (IOException e){
	        System.out.println("ERROR");
	    		}
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
	

}
