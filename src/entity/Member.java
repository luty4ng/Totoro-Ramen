package entity;

import java.util.*;
import java.util.regex.Matcher;  
import java.util.regex.Pattern;

public class Member {
	private String mID;
	private String surName;
	private String firstName;
	private String email;
	private String phoneNum;
	private int virtualStamps;
	
	private ArrayList<String> data;
	private ArrayList<String> config;
	private DataProcessor csvConfig;
	private DataProcessor csvMember;
	
	public Member(String memberNumber)
	{
		//Load configuration & members data;
		csvConfig = new DataProcessor("data/configure.csv");
		csvMember = new DataProcessor("data/member.csv");
		config = csvConfig.Read();
		data = csvMember.Read();
		this.mID = memberNumber;
	}
	
	public Member()
	{
		//Load configuration & members data;
		csvConfig = new DataProcessor("data/configure.csv");
		csvMember = new DataProcessor("data/member.csv");
		config = csvConfig.Read();
		data = csvMember.Read();
		
	}
	
	public void test()
	{
		for(String i:data)
			System.out.println(i);
	}
	
	
	private String idGenerator(int length)
	{
	     String str="123456789";
	     Random random=new Random();
	     StringBuffer sb=new StringBuffer();
	     for(int i=0;i<length;i++){
	       int number=random.nextInt(9);
	       sb.append(str.charAt(number));
	     }
	     return sb.toString();
		 
	}
	
	private boolean checkFormat(String str, String type)
	{
		String pattern = "";
		if(type == "email")
			pattern = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$"; 
		if(type == "phone")
			pattern = "^[0-9]*$";
		
		 Pattern regex = Pattern.compile(pattern);  
	     Matcher matcher = regex.matcher(str);  
	     return matcher.matches();
	}
	
	public boolean checkMember(String mid)
	{
		for(String i:data)
			if(i.split(",")[0].equals(mid))
				return true;
		return false;
	}
	
	public void addMember(String newdata)
	{
		data.add(newdata);
		csvMember.Write(data);
		for(String i:config)
		{
			config.remove(0);
			config.add(i.split(",")[0]+"," + (Integer.toString(Integer.parseInt(i.split(",")[1])+1)));
		}
		csvConfig.Write(config);
	}
	
	public void deleteMember(String mid)
	{
		Iterator<String> d=data.iterator();
        while(d.hasNext()){
            String a=d.next();
            if (a.split(",")[0].equals(mid)) {
                d.remove();
            }
        }
		csvMember.Write(data);
		
		
		
		for(String i:config)
		{
			config.remove(0);
			config.add(i.split(",")[0]+"," + (Integer.toString(Integer.parseInt(i.split(",")[1])-10)));
		}
		csvConfig.Write(config);
	}
	
	
	public String register(String surName,String firstName, String email, String phoneNum)
	{
		String mid = idGenerator(6);
		if(!checkFormat(email,"email")) {
			return "email";
		}
			
		if(!checkFormat(phoneNum,"phone") || phoneNum.length() != 11) {
			return "phone";
		}
		
		while(this.checkMember(mid))
			mid = idGenerator(6);
		
		String info = String.join(",", new String[]{mid,surName,firstName, email, phoneNum,"0"});
		this.addMember(info);
		return mid;

	}
	
	public boolean login(String mid)
	{
		if(!checkMember(mid))
			return false;
		else
			return true;
	}
	
	public String getStamps(String mid)
	{
		for(String i:data)
			if(i.split(",")[0].equals(mid))
				return i.split(",")[5];
		return "none";
	}
	
	public void useStamps(String mid)
	{
		int count = 0;
		for(String i:data)
		{
			if(i.split(",")[0].equals(mid))
			{
				String new_str = i.substring(0,i.length()-1) + Integer.toString(Integer.parseInt(i.substring(i.length()-1))-1);
				data.set(count, new_str);
			}
			count++;
		}
		csvMember.Write(data);
		
				
	}
	public void addStamps(String mid)
	{
		int count = 0;
		for(String i:data)
		{
			if(i.split(",")[0].equals(mid))
			{
				String new_str = i.substring(0,i.length()-1) + Integer.toString(Integer.parseInt(i.substring(i.length()-1))+1);
				data.set(count, new_str);
			}
			count++;
		}
		csvMember.Write(data);
	}
	
	public String getmID() {
		return mID;
	}
	
	public static void main(String[] args) {
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
	}
}
