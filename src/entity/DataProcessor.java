package entity;

import java.io.*;
import java.util.*;

public class DataProcessor {
	File csvFile;
	BufferedReader csvReader;
	BufferedWriter csvWriter;
	Dictionary dict;
	
	//���캯��
	public DataProcessor(String fileName) {
		csvFile = new File(fileName);
		System.out.println(csvFile.exists());
		dict = new Hashtable();
		try {
			csvReader = new BufferedReader(new FileReader(csvFile));
			String[] fields = csvReader.readLine().split(",");
			for(int i=0;i<fields.length;i++)
			{
				dict.put(i, fields[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// ��������
	public void finalize()
	{
		try {
			csvReader.close();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// ��������ȡ
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
	
	public  String Read(int row, int col){
        try {           
         //BufferedReader reade = new BufferedReader(new FileReader("..\\..\\data\\material.csv"));           
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
	
	// ������ȡ Ŀǰ��֧�ֵ�������ѯ
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


	// ����д��
	public void Write() {
		try {
			csvWriter = new BufferedWriter(new FileWriter(csvFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// ���Ŀ���ļ�ÿ��? ����-���? �Ķ�Ӧ��ϵ ������
	private void CheckDict()
	{
		for (Enumeration i = dict.keys(); i.hasMoreElements();)
            System.out.println("keys : " + i.nextElement());
		for (Enumeration i = dict.elements(); i.hasMoreElements();)
            System.out.println("Values : " + i.nextElement());

	}
	
	// ���Ժ��� ����д
	public void test() {
		String[] a = "yes;".split(";");
		String[] b = "yes".split(";");
		System.out.println(a[0]);
		System.out.println(b[0]);
	}
	
	
	public static void main(String[] args) {
		// Example
		DataProcessor csv = new DataProcessor("data/test.csv");
		//ArrayList<String> result = csv.Read();
		ArrayList<String> result = csv.Read("Age=20");
		for(String i:result)
			System.out.println(i);
		
	}
}