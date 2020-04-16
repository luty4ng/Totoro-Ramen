package entity;

import java.io.*;
import java.util.*;

public class DataProcessor {
	File csvFile;
	BufferedReader csvReader;
	BufferedWriter csvWriter;
	Dictionary dict;
	private String firstLine;
	
	//	Constructor: define which csv file you want to access
	public DataProcessor(String fileName) {
		csvFile = new File(fileName);
		boolean flag = !this.csvFile.exists();
		if(!this.csvFile.exists())
			try {
				csvFile.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		//System.out.println(csvFile.exists());
		dict = new Hashtable();
		try {
			csvReader = new BufferedReader(new FileReader(csvFile));
			try {
				if(flag)
					firstLine = " ";
				else
					firstLine = csvReader.readLine();
				String[] fields = firstLine.split(",");
				
				for(int i=0;i<fields.length;i++)
				{
					dict.put(i, fields[i]);
				}
			} catch(Exception e) {
				System.out.println("Empty file detected.");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Destructor: close reader & writer
	public void finalize()
	{
		try {
			csvReader.close();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Read all the contents in target csv file
	public ArrayList<String> Read()
	{
		String temp;
		ArrayList<String> result = new ArrayList<String>();
		int counter = 0;
		try {
				csvReader = new BufferedReader(new FileReader(csvFile));
				while ((temp = csvReader.readLine()) != null){
					String[] str = temp.split(",");
					if(counter!=0)
						result.add(temp);
					counter++;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		return result;
	}
	
	// Query the contents by Row&Colum
	public  String Read(int row, int col){
        try {           
         String line = null;
         int index=0;
         while((line=csvReader.readLine())!=null){
             String item[] = line.split(",");                
          if(index==row-1){
              if(item.length>=col-1){
                  String last = item[col-1];
					System.out.println(last);
                  return last;      
              }
          }
          index++;
          }      
         } catch (Exception e) {
          e.printStackTrace();
			}
			return "none";
  }
	
	// Query the contents by condition, e.g Read("Age=20")
	public ArrayList<String> Read(String condition) {
		String temp;
		ArrayList<String> result = new ArrayList<String>();
		Dictionary conditions = new Hashtable();
		int counter = 0;
		
		for(String i:condition.split(";"))
			conditions.put(i.split("=")[0], i.split("=")[1]);
		try {
				csvReader = new BufferedReader(new FileReader(csvFile));
				while ((temp = csvReader.readLine()) != null){
					String[] str = temp.split(",");
					if(counter!=0)
					{
						for(int i=0;i<str.length;i++)
						{
							if(conditions.get(dict.get(i))!=null)
							{
								if(str[i].equals(conditions.get(dict.get(i)).toString()))
									result.add(temp);
							}
						}
					}
					counter++;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		return result;	
	}


	// Write your contents in csv file
	public void Write(ArrayList<String> str) {
		try {
			
			csvWriter = new BufferedWriter(new FileWriter(csvFile));
			csvWriter.write(firstLine);
			csvWriter.newLine();
			csvWriter.flush();
			for (String l:str){
	            csvWriter.write(l);
	            csvWriter.newLine();
	            csvWriter.flush();
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void WriteLine(String str) {
		try {
			
			csvWriter = new BufferedWriter(new FileWriter(csvFile, true));
            csvWriter.write(str);
            csvWriter.newLine();
            csvWriter.flush();
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// Check the mapping between index and attributes of csv first line
	private void CheckDict()
	{
		for (Enumeration i = dict.keys(); i.hasMoreElements();)
            System.out.println("keys : " + i.nextElement());
		for (Enumeration i = dict.elements(); i.hasMoreElements();)
            System.out.println("Values : " + i.nextElement());
		
		//System.out.println(dict.get("Email"));

	}
	
	// just a test function write whatever u want:)
	public void test() {
		String[] a = "yes;".split(";");
		String[] b = "yes".split(";");
		System.out.println(a[0]);
		System.out.println(b[0]);
	}
	
	
	public static void main(String[] args) {
		// Usage Example
		DataProcessor csv = new DataProcessor("data/test.csv");
		csv.CheckDict();
		//ArrayList<String> result = csv.Read();
		ArrayList<String> result = csv.Read("Age=20");
		for(String i:result)
			System.out.println(i);
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("a,b,c");
		str.add("1,2,3");
		DataProcessor csvw = new DataProcessor("data/test2.csv");
		csvw.Write(str);

		
	}
}