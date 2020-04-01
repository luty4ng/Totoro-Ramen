import java.io.*;
import java.util.*;

public class DataProcessor {
	File csvFile;
	BufferedReader csvReader;
	BufferedWriter csvWriter;
	Dictionary dict;
	
	//构造函数
	public DataProcessor(String fileName) {
		csvFile = new File(fileName);
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
	
	// 析构函数
	public void finalize()
	{
		try {
			csvReader.close();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 无条件读取
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
	
	// 条件读取 目前仅支持单条件查询
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


	// 数据写入
	public void Write() {
		try {
			csvWriter = new BufferedWriter(new FileWriter(csvFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 检查目标文件每列 名称-序号 的对应关系 测试用
	private void CheckDict()
	{
		for (Enumeration i = dict.keys(); i.hasMoreElements();)
            System.out.println("keys : " + i.nextElement());
		for (Enumeration i = dict.elements(); i.hasMoreElements();)
            System.out.println("Values : " + i.nextElement());

	}
	
	// 测试函数 随意写
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