package boundary;

import java.awt.Font;
import java.util.ArrayList;

import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;

import control.MainFunction;
import entity.DataProcessor;


/*** This class is data visualization
* @author Yujun Jin
* @version 0.5
*/
public class addon_view {

	public static void main(String[] args){
		addon_view bar = new addon_view();
		bar.Bar();
	}

	/*
	 * create a chart
	 */
	public void Bar() {
		
		entity.DataProcessor user = new entity.DataProcessor("data/order.csv");
		ArrayList<String> number1 = user.Read();
		//get size of the file
		int extraNori = 0;
		int extraBoiledEgg = 0;
		int bambooShoots = 0;
		int extraChashu = 0;
		for(int j=0; j<number1.size(); j++) {
			String temp = number1.get(j);
			String[] str = temp.split(",");
			if(str.length != 5) {
				extraNori = extraNori + Integer.parseInt(str[8]);
				extraBoiledEgg = extraBoiledEgg + Integer.parseInt(str[9]);
				bambooShoots = bambooShoots + Integer.parseInt(str[10]);
				extraChashu = extraChashu + Integer.parseInt(str[11]);
			}
		}
		//create dataset
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		dataset.addValue(extraNori,"extraNori","extra" );

		dataset.addValue(extraBoiledEgg, "extraBoildedEgg","extra");

		dataset.addValue(bambooShoots, "bambooShoots","extra");

		dataset.addValue(extraChashu, "extraChashu","extra");
		

		

		JFreeChart barChart =  ChartFactory.createBarChart3D(

				"add-ones",

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
			 DataProcessor.saveAsFile(barChart, "data/weeklyReport/addOnChart.png", 800, 800); 
		 }

	}

 


}