package entity;


	import java.io.BufferedReader;
    import java.io.FileReader;
    
	public class CSVUtil {
	    public  String read(int row, int col){
	          try {           
	           BufferedReader reade = new BufferedReader(new FileReader("..\\..\\data\\material.csv"));           
	           String line = null;
	           int index=0;
	           while((line=reade.readLine())!=null){
                   //System.out.println(line);
                   String item[] = line.split(",");// splited by ,
                   //System.out.println(item[1]);                   
	            if(index==row-1){
                    //System.out.println(item.length);//test
                    //System.out.println("ghghgghgh");
	                if(item.length>=col-1){
	                    String last = item[col-1];
						System.out.println(last);
						reade.close();
                        return last;
                        //System.out.println("tx");         
	                }
	            }
	            //int value = Integer.parseInt(last);
	            index++;
	            }      
	           } catch (Exception e) {
	            e.printStackTrace();
				}
				return "none";
        }
	    public static void main(String[] args) {
	        CSVUtil test = new CSVUtil();
			String st = test.read(3,3);
			System.out.println(st);
	    }
	}