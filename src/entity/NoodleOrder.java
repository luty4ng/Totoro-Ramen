package entity;

/*** This class is noodleorder management and identification
* @author Yujun Jin
* @version 0.5
*/
public class NoodleOrder {
    private String nID = "zero";

    //Fixed price
    private String soup = "no_soupw";
    private String noodles = "no_noodle";
    private String springOnion = "no_onion";
    
    private String nori;
    private String chashu;
    private String boiledEgg;

    private int spiciness;//1--5
    //Add-ons
    private int extraNori = 0;
    private int extraBoiledEgg = 0;
    private int bambooShoots = 0;
    private int extraChashu = 0;

    private double price = 0;
    
    public NoodleOrder(int _n,  //The nth suborder of the order
                       String Oid, 
                       String _soup, 
                       String _noodles, 
                       String _springOnion,
                       String _nori,
                       String _chashu,
                       String _boiledEgg,
                       int _spiciness ) {
       /**
	   * Constructor, initialize noodleorder here
	   * @param _n the nth sub-noodleorder of the order.
       * @param 0id the id of the order.
       * @param _soup the sort of the soup.
       * @param _noodel the sort ofthe noodle.
       * @param _springOnion the sort of the springonion.
       * @param _nori the sort of thr nori.
       * @param _chashu the sort of chashu.
       * @param _boiledEgg the sort of boildEgg.
       * @param _spiciness the spiciness of the noodle. range from 1 to 5.
	   * @return none
	   */                   
        this.soup = _soup;
        this.noodles = _noodles;
        this.springOnion = _springOnion;
        this.nori = _nori;
        this.chashu = _chashu;
        this.boiledEgg = _boiledEgg;
        this.spiciness = _spiciness;
        
        if(_n<10 && _n>0){
            this.nID = Oid + "0" + String.valueOf(_n);
        }else if( _n > 0 ){
            this.nID = Oid + String.valueOf(_n);
        }else{
            System.out.println("error");
        }
    }
    public NoodleOrder() {
		// TODO Auto-generated constructor stub
	}
	/*1st row subOrderDetail[0] is noodle
     *2nd row subOrderDetail[1] is extraNori
     *3rd row subOrderDetail[2] is extraBoiledEgg
     *4th row subOrderDetail[3] is bambooShoots
     *5th row subOrderDetail[4] is extraChashu
     */
    public String[][] subOrderDetail() {
        /**
         * @return suborder Detail.
         */
    	String[][] subOrderDetail = new String[5][3];
    	subOrderDetail[0][0] = this.soup + " noodle"; subOrderDetail[0][1] = "1"; 
    	if(this.price==0)
    		subOrderDetail[0][2] = String.valueOf(Order.menu.getnoodlePrice()) + "----Discount";
    	else
    		subOrderDetail[0][2] = String.valueOf(Order.menu.getnoodlePrice());
    	subOrderDetail[1][0] = "------extra Nori"; subOrderDetail[1][1] = String.valueOf(this.extraNori); subOrderDetail[1][2] = String.valueOf(Order.menu.getnoriPrice()*this.extraNori);
    	subOrderDetail[2][0] = "------extra boiled egg"; subOrderDetail[2][1] = String.valueOf(this.extraBoiledEgg); subOrderDetail[2][2] = String.valueOf(Order.menu.geteggPrice()*this.extraBoiledEgg);
    	subOrderDetail[3][0] = "------extra bambooShoots"; subOrderDetail[3][1] = String.valueOf(this.bambooShoots); subOrderDetail[3][2] = String.valueOf(Order.menu.getbambooPrice()*this.bambooShoots);
    	subOrderDetail[4][0] = "------extra chashu"; subOrderDetail[4][1] = String.valueOf(this.extraChashu); subOrderDetail[4][2] = String.valueOf(Order.menu.getchashuPrice()*this.extraChashu);
    	return subOrderDetail;
    }
    
    public String add(int _extraNori,
                      int _extraBoiledEgg,
                      int _bambooShoots,
                      int _extraChashu ){
        /**
         * method to add Add-ones
         * @param _extraNori the quantity of extra Nori.
         * @param _extraBoiledEgg the quantity of bambooshoots
         * @param _extraChashu the quantity of extraChashu
         * @return String state
         */
        this.extraNori = _extraNori;
        this.extraBoiledEgg = _extraBoiledEgg;
        this.bambooShoots = _bambooShoots;
        this.extraChashu = _extraChashu;

        String state = "Add " + Integer.toString(_extraNori) + " extraNori, " 
                              + Integer.toString(_bambooShoots) + " bambooShoots, "
                              + Integer.toString(_extraBoiledEgg) +" extraBoiledEgg, "
                              + Integer.toString(_extraChashu) + "extraChashu";
        price();
        return state;                   
    }

	public String getId() {
        /**
         * method to get ID
         * @return nID
         */
		return nID;
    }
  
    public double price(){
        /**
         *method to colculate and get price
         *@return price
         */
        this.price =       Order.menu.getnoodlePrice() 
        				 + extraNori*Order.menu.getnoriPrice() 
                         + bambooShoots*Order.menu.getbambooPrice()
                         + extraChashu*Order.menu.getchashuPrice()
                         + extraBoiledEgg*Order.menu.geteggPrice();
        return this.price;
    }
    
    public double getPrice() {
        /**
         *method to get price
         *@return price
         */
    	return this.price;
    }
    
	public String toString() {
        /**
         *method to print
         *@return none
         */
		return String.join(",", new String[]{nID,
											soup,
											noodles,
											springOnion, 
											nori, 
											chashu,
											boiledEgg,
											String.valueOf(this.spiciness),
											String.valueOf(this.extraNori),
											String.valueOf(this.extraBoiledEgg),
											String.valueOf(this.bambooShoots),
											String.valueOf(this.extraChashu),
											String.valueOf(this.price)});
	}
	public void setPrice(double price) {
        /**
         * method to set price
         * @return none
         */
		this.price = price;
	}
	public String getNori() {
        /**
         * method to getNori
         * @return none
         */
		  return this.nori;
	}
	public String getchashu() {
        /**
         * method to get chashu
         * @return none
         */
		  return this.chashu;
	}
	public String getegg() {
        /**
         * method to get egg
         * @return none
         */
		  return this.boiledEgg;
	}
}