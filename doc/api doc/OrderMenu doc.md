// 
// auther: qizhou Zhang
// time: 2020 04/23
// 
// class: OrderMenu
//

------

```java
/*
 *These are the member variables of the class
 */
//Food prices
	private double noodlePrice;
	private double noriPrice;
	private double eggPrice;
	private double bambooPrice;
	private double chashuPrice;
//Food supply
	private int noriAvailable;
	private int eggAvailable;
	private int bambooAvailable;
	private int chashuAvailable;

/*
 *These are the methods of the class
 */
//This is the constructor of this class
//Pass the data in the file into a variable
	public OrderMenu() {
		readMenu();
	}
//Read CSV file
	public void readMenu() {
	/*Get the data from the file
    *Assign the data to the corresponding variable
    */
	}
	//write CSV file
	public void writeMenu() {
	/*
    *Writes the final variable data to a file store
    */
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
