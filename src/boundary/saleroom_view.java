package boundary;

import java.awt.Font;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.CategoryDataset;
import entity.DataProcessor;


/*** This class is data visualization
* @author Yujun Jin
* @version 0.5
*/
public class saleroom_view {

	public static void main(String[] args){
		saleroom_view bar = new saleroom_view();
		bar.Bar();
	}

    /**
     * create chart
     * @return none
     */
	public void Bar() {
		
		entity.DataProcessor user = new entity.DataProcessor("data/order.csv");
		ArrayList<String> number1 = user.Read();
		//get size of the file
		double monday = 0;
		double tuesday= 0;
		double wednesday = 0;
		double thursday = 0;
		double friday = 0;
		double saturday = 0;
		double sunday = 0;
		for(int j=0; j<number1.size(); j++) {
			String temp = number1.get(j);
			String[] str = temp.split(",");
			if(str.length == 5){
				if(str[1].equals("1")) {
					monday = monday + Double.parseDouble(str[3]);
				}else if(str[1].equals("2")) {
					tuesday = tuesday + Double.parseDouble(str[3]);
				}else if(str[1].equals("3")) {
					wednesday = wednesday + Double.parseDouble(str[3]);
				}else if(str[1].equals("4")) {
					thursday = thursday + Double.parseDouble(str[3]);
				}else if(str[1].equals("5")) {
					friday = friday + Double.parseDouble(str[3]);
				}else if(str[1].equals("6")) {
					saturday = saturday + Double.parseDouble(str[3]);
				}else {
					sunday = sunday + Double.parseDouble(str[3]);
				}
			}
		}


		//create dataset
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		dataset.addValue(monday,"monday","week" );

		dataset.addValue(tuesday, "tuesday","week");

		dataset.addValue(wednesday, "wednesday","week");

		dataset.addValue(thursday, "thursday","week");
		
		dataset.addValue(friday, "friday","week");
		
		dataset.addValue(saturday, "saturday","week");
		
		dataset.addValue(sunday, "sunday","week");
		


		JFreeChart barChart =  ChartFactory.createBarChart3D(

				"saleroom",

				"variety",     

				"quantity" ,    

				dataset,  

				PlotOrientation.VERTICAL,

				true,       
				true,       

				true        

				);

		

		

		CategoryPlot barPlot = barChart.getCategoryPlot();

		barChart.getLegend().setItemFont(new Font("Times New Roman", Font.PLAIN, 12)); 

       

		CategoryAxis domainAxis = barPlot.getDomainAxis(); 

		 domainAxis.setTickLabelFont(new Font("sans-serif", Font.PLAIN, 11));  

	     domainAxis.setLabelFont(new Font("Times New Roman", Font.PLAIN, 12)); 

	        

        ValueAxis rAxis = barPlot.getRangeAxis();        

        rAxis.setTickLabelFont(new Font("sans-serif", Font.PLAIN, 12));  

        rAxis.setLabelFont(new Font("Times New Roman", Font.PLAIN, 12));  

		

        TextTitle textTitle = barChart.getTitle(); 

        textTitle.setFont(new Font("Times New Roman", Font.PLAIN, 20));  

        
		

		ChartFrame barChartFrameframe = new ChartFrame("barChartFrame",barChart);

		barChartFrameframe.pack();

		barChartFrameframe.setVisible(true);
		 if(view_states.hasWeek) {
			 DataProcessor.saveAsFile(barChart, "data/weeklyReport/salesroomChart.png", 800, 800); 
		 }

	}

 


}