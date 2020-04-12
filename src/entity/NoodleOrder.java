package entity;


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
    /*1st row subOrderDetail[0] is noodle
     *2nd row subOrderDetail[1] is extraNori
     *3rd row subOrderDetail[2] is extraBoiledEgg
     *4th row subOrderDetail[3] is bambooShoots
     *5th row subOrderDetail[4] is extraChashu
     */
    public String[][] subOrderDetail() {
    	String[][] subOrderDetail = new String[5][3];
    	subOrderDetail[0][0] = this.soup + " noodle"; subOrderDetail[0][1] = "1"; subOrderDetail[0][2] = String.valueOf(Order.menu.getnoodlePrice());
    	subOrderDetail[1][0] = "！！extra Nori"; subOrderDetail[1][1] = String.valueOf(this.extraNori); subOrderDetail[1][2] = String.valueOf(Order.menu.getnoriPrice()*this.extraNori);
    	subOrderDetail[2][0] = "！！extra boiled egg"; subOrderDetail[2][1] = String.valueOf(this.extraBoiledEgg); subOrderDetail[2][2] = String.valueOf(Order.menu.geteggPrice()*this.extraBoiledEgg);
    	subOrderDetail[3][0] = "！！extra bambooShoots"; subOrderDetail[3][1] = String.valueOf(this.bambooShoots); subOrderDetail[3][2] = String.valueOf(Order.menu.getbambooPrice()*this.bambooShoots);
    	subOrderDetail[4][0] = "！！extra chashu"; subOrderDetail[4][1] = String.valueOf(this.extraChashu); subOrderDetail[4][2] = String.valueOf(Order.menu.getchashuPrice()*this.extraChashu);
    	return subOrderDetail;
    }
    
    //Add-ones
    //should modify the number of the moterial,haven't done
    public String add(int _extraNori,
                      int _extraBoiledEgg,
                      int _bambooShoots,
                      int _extraChashu ){
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
		return nID;
    }
  
    public double price(){
        this.price =       Order.menu.getnoodlePrice() 
        				 + extraNori*Order.menu.getnoriPrice() 
                         + bambooShoots*Order.menu.getbambooPrice()
                         + extraChashu*Order.menu.getchashuPrice()
                         + extraBoiledEgg*Order.menu.geteggPrice();
        return this.price;
    }
    
    public double getPrice() {
    	return this.price;
    }
    
}