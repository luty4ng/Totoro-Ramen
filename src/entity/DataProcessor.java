package entity;

import java.io.*;
import java.util.*;

/*** This class is for data management and storage
* @author Tingyang Lu
* @version 0.5
*/
public class DataProcessor {
	File csvFile;
	BufferedReader csvReader;
	BufferedWriter csvWriter;
	Dictionary dict;
	private String firstLine;
	

	public DataProcessor(String fileName) {
		/**
	   * Constructor, define which csv file you want to access
	   * @param fileName the filename and path you want to visit
	   * @return none
	   */
		csvFile = new File(fileName);
		boolean flag = !this.csvFile.exists();
		if(!this.csvFile.exists())
			try {
				csvFile.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

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
	

	public void finalize()
	{
		/**
	   * Destructor, close reader & writer
	   * @return none
	   */
		try {
			csvReader.close();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public ArrayList<String> Read()
	{
		/**
	   * Read all the contents in target csv file
	   * @return an arraylist that contains all csv file contents.
	   */
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
	
	public  String Read(int row, int col){
		/**
	   * Query the contents by Row&Colum
	   * @param row the row of target contents
	   * @param col the colume of target contens
	   * @return target csv contents in String
	   */
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
	

	public ArrayList<String> Read(String condition) {
		/**
	   * Query the contents by condition, e.g Read("Age=20")
	   * @param condition condition syntax like "Age=20" or "name=Alice"
	   * @return an arraylist that contains target content.
	   */
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



	public void Write(ArrayList<String> str) {
		/**
	   * Write your contents in csv file at one time
	   * @param str your data in Arraylist format
	   * @return none
	   */
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
		/**
	   * Add your contents in csv file 
	   * @param str your data in string format
	   * @return none
	   */
		try {
			
			csvWriter = new BufferedWriter(new FileWriter(csvFile, true));
            csvWriter.write(str);
            csvWriter.newLine();
            csvWriter.flush();
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void CheckDict()
	{
		/**
	   * Show the mapping between index and attributes of csv first line
	   * @return none
	   */

		for (Enumeration i = dict.keys(); i.hasMoreElements();)
            System.out.println("keys : " + i.nextElement());
		for (Enumeration i = dict.elements(); i.hasMoreElements();)
            System.out.println("Values : " + i.nextElement());
	}
	

	public String test() {
		String[] a = "yes;".split(";");
		String[] b = "yes".split(";");
		System.out.println(a[0]);
		System.out.println(b[0]);
		return "Create Success";
	}
	
	
	public static void main(String[] args) {

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