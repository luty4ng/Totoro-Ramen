### classes introduction

----

**welcome.java**

```java
/*
	Functions: 
	1. as the first interface, welcome the users.
	2. the user can choose "customer" or "manager" as his or her identity.
	3. if the user is a customer, record the time when he click this button.

	Input:
        none
     
    Return:
    	none
*/
```

**order_ramen.java**

```java
/*
	Functions: 
	1. the user can order a bowl of ramen by clicking some buttons.

	Input:
        Order order
     
    Return:
    	none
*/
```

**add_on.java**

```java
/*
	Functions: 
	1. show different prices of different add-ons.
	2. the user can order some add-ons for the ramen he order in last interface by clicking some buttons.
	3. return back to last interface to choose the ramen again.

	Input:
        Order order
        NoodleOrder noodle
     
    Return:
    	none
*/
```

**confirm_order.java**

```java
/*
	Functions: 
	1. show all ramen orders and prices in details in a table.
	2. choose another bowl of ramen as well as its add-ons.
	3. calculate and present the total price.
	4. the user can confirm and submit the order after browsing the detials.

	Input:
        Order order
     
    Return:
    	none
*/
```

**loyalty_scheme.java**

```java
/*
	Functions: 
	1. ask the customer whether he or she is a VIP member.

	Input:
        Order order
     
    Return:
    	none
*/
```

**VIP_log_in.java**

```java
/*
	Functions: 
	1. the user can input VIP number to login.
	2. if the entered VIP number doesn't exist, there will be a warning.

	Input:
        Order order
     
    Return:
    	none
*/
```

**whether_register.java**

```java
/*
	Functions: 
	1. the user can whether to register as a VIP member.
	2. if skip loyalty scheme, the customer can pay directly.

	Input:
        Order order
     
    Return:
    	none
*/
```

**VIP_register.java**

```java
/*
	Functions: 
	1. the user can register as a VIP member.
	2. if the entered message for registering is invalid, there will be corresponding warnings.
	3. if register successfully, he or she can see the new VIP number and login directly.

	Input:
        Order order
     
    Return:
    	none
*/
```

**enough_for_discount.java**

```java
/*
	Functions: 
	1. present the number of stamps of the VIP customer.
	2. remind the VIP customer that he or she can pay with a discount.

	Input:
        Order order
        String memberNumber
     
    Return:
    	none
*/
```

**less_than_10.java**

```java
/*
	Functions: 
	1. present the number of stamps of the VIP customer.
	2. remind the VIP customer that he or she can not pay with a discount.

	Input:
        Order order
        String memberNumber
     
    Return:
    	none
*/
```
**pay_ment_interface**

```java
/*
	Functions: 
	1. show all ramen orders and prices in details in a table.
	2. calculate and present the discount and total price.
	3. the user can confirm and the order after browsing the detials then choose payment method.

	Input:
        Order order
        Double totalprice
     
    Return:
    	none
*/
```
**deal_complete**

```java
/*
	Functions: 
	1. show the user that ordering has completed.
	2. exit this interface

	Input:
      none
     
    Return:
    	none
*/
```
**Backstagetest**

```java
/*
	Functions: 
	1. user can choose modify menu or view state.
	2. user can press corresponding button.

	Input:
      none
     
    Return:
    	none
*/
```
**modify_menu**

```java
/*
	Functions: 
	1. user can change the prices and stock of food.
	2. user can enter numbers into the textbox to modify menu.

	Input:
      none
     
    Return:
    	none
*/
```
**view**

```java
/*
	Functions: 
	1. user can choose to see sales in past week, saleroom and addons.
	2. user can press the corresponding button.

	Input:
      none
     
    Return:
    	none
*/
```