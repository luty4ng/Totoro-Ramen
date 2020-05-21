### Usage Example

----

```java
Member member = new Member();

String mid = "636984";

String new_surName = "Wu";
String new_firstName = "Wang";
String new_email = "123@gmail.com";
String new_phoneNum = "18810727322";



try {
    String new_mid = member.register(new_surName,new_firstName,new_email,new_phoneNum);
    System.out.println("You successfully register, you member id is " + new_mid);
} catch (Exception e) {
    e.printStackTrace();
}

member.addStamps(mid);

member.useStamps(mid);

if(member.login(mid))
    System.out.println("The Stamps you have: " + member.getStamps(mid));


member.deleteMember("111111");
```



### Method

----

**String register()**

```java
/*
	Functions: 
	1. Create a new member account with random member id in 6 integer.
	2. Check format of email & phone number.
    3. Throw Exception which means you have to use it in a try{} block.

	Input:
        String surName
        String firstName
        String email
        String phoneNum
     
    Return:
    	String newMemberId
*/
```

**boolean login()**

```java
/*
	Functions: 
	1. login with member id that provided.
	2. check if member id is exist then return true or false.

	Input:
        String mid
     
    Return:
    	true: login successfully
    	false: login fail
*/
```

**String getStamps()**

```java
/*
	Functions: 
	1. Get the number of virtual stamps that current member has.

	Input:
        String mid
     
    Return:
    	String numberOfStamps
    	"none" if mid not exist
*/
```

**void useStamps()**

```java
/*
	Functions: 
	1. use one stamps in target member account.

	Input:
        String mid
*/
```

**void addStamps()**

```java
/*
	Functions: 
	1. add one stamps in target member account.

	Input:
        String mid
*/
```

**void deleteMember()**

```java
/*
	Functions: 
	1. delete taget member account

	Input:
        String mid
*/
```



### CSV Data Format

![NtuiT.png](https://cdn.img.wenhairu.com/images/2020/04/14/NtuiT.png)

如果图显示不出来可以直接看``data/member.csv``