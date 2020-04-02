public class NoodleOrder {
    private String nID = "zero";

    //必选区
    private String soup = "no_soupw";
    private String noodles = "no_noodle";
    private String springOnion = "no_onion";
    
    private String nori;
    private String chashu;
    private String boiledEgg;

    private int spiciness;//1--5
    //加料区
    private int extraNori = 0;
    private int extraBoiledEgg = 0;
    private int bambooShoots = 0;
    private int extraChashu = 0;

    private double price = 0;
    
    //这里应该需要修改csv文件中的食材数量，还未添加。
    public NoodleOrder(int _n,  //这个订单的第几个子订单
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
            this.nID = Oid + "0" + Integer.toString(_n);
        }else if( _n > 0 ){
            this.nID = Oid + Integer.toString(_n);
        }else{
            System.out.println("error");
        }
    }
    
    //额外加料
    //这里需要添加修改csv文件中食材数量的功能 还未添加
    public String add(int _extraNori,
                      int _bambooShoots,
                      int _extraBoiledEgg,
                      int _extraChashu ){
        this.extraNori = _extraNori;
        this.extraBoiledEgg = _extraBoiledEgg;
        this.bambooShoots = _bambooShoots;
        this.extraChashu = _extraChashu;

        String state = "Add " + Integer.toString(_extraNori) + " extraNori, " 
                              + Integer.toString(_bambooShoots) + " bambooShoots, "
                              + Integer.toString(_extraBoiledEgg) +" extraBoiledEgg, "
                              + Integer.toString(_extraChashu) + "extraChashu";
        return state;                   
    }

	public String getId() {
		return nID;
    }
    
    //这里应该添加向csv读取加个的功能
    public double price(){
        CSVUtil reader = new CSVUtil();
        this.price = 9.9 + extraNori*(Double.parseDouble(reader.read(2,3))) 
                         + bambooShoots*(Double.parseDouble(reader.read(3,3)))
                         + extraChashu*(Double.parseDouble(reader.read(4,3)))
                         + extraBoiledEgg*(Double.parseDouble(reader.read(5,3)));
        return this.price;
    }
}