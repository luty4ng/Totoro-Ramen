// 
// auther: yujun jin
// time: 2020 3/26
// 
// class: NoodleOrder
//

------

```java
/*
 *These are the member variables of the class
 */

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
```
### Method

**public NoodleOrder()**

```java
    /*
        This is the constructor of this class
     */
```

**String[][] subOrderDetail()**
```java
    /*return:
     *1st row subOrderDetail[0] is noodle
     *2nd row subOrderDetail[1] is extraNori
     *3rd row subOrderDetail[2] is extraBoiledEgg
     *4th row subOrderDetail[3] is bambooShoots
     *5th row subOrderDetail[4] is extraChashu
     */
```

**public String add()**
```java
    //Add-ones
    //should modify the number of the moterial,haven't done
```


**public String getId()**
```java
    //this method is to get the ID of the noddleorder
```

**public double price()**
```java 
    //this method is to get the price of the class
    //
    //return:price
```

**String toString()**
```java
    //return: get all the information
```


    