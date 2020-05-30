package boundary;

import java.awt.Color;

import java.util.ArrayList;

import org.jfree.chart.*;

import org.jfree.chart.ChartFrame;

import org.jfree.chart.JFreeChart;

import org.jfree.chart.plot.CategoryPlot;

import org.jfree.chart.plot.PlotOrientation;

import org.jfree.data.category.DefaultCategoryDataset;

import entity.DataProcessor;

import org.jfree.data.category.CategoryDataset;
/*** This class is data visualization
* @author Yujun Jin
* @version 0.5
*/
public class sale_valume{

    public static void main(String[] args) {
    	sale_valume x = new sale_valume();
    	x.GetDataset();
    	   
    }

    public  void GetDataset()
    /**
     * create frame
     * @return none
     */
    {
    	DefaultCategoryDataset mDataset = new DefaultCategoryDataset();
        entity.DataProcessor user = new entity.DataProcessor("data/order.csv");
        ArrayList<String> number1 = user.Read();
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
					monday = monday + Double.parseDouble(str[4]);
				}else if(str[1].equals("2")) {
					tuesday = tuesday + Double.parseDouble(str[4]);
				}else if(str[1].equals("3")) {
					wednesday = wednesday + Double.parseDouble(str[4]);
				}else if(str[1].equals("4")) {
					thursday = thursday + Double.parseDouble(str[4]);
				}else if(str[1].equals("5")) {
					friday = friday + Double.parseDouble(str[4]);
				}else if(str[1].equals("6")) {
					saturday = saturday + Double.parseDouble(str[4]);
				}else {
					sunday = sunday + Double.parseDouble(str[4]);
				}
			}
		}

        mDataset.addValue(monday, "sale_valume", "monday");

        mDataset.addValue(tuesday, "sale_valume", "tuesday");

        mDataset.addValue(wednesday, "sale_valume", "wednesday");

        mDataset.addValue(thursday, "sale_valume", "thursday");

        mDataset.addValue(friday, "sale_valume", "friday");

        mDataset.addValue(saturday, "sale_valume", "saturday");

        mDataset.addValue(sunday, "sale_valume", "sunday");


        JFreeChart mChart = ChartFactory.createLineChart(

                "sale volume",

                "day",

                "number",

                mDataset,

                PlotOrientation.VERTICAL,

                true, 

                true, 

                false);

 

        CategoryPlot mPlot = (CategoryPlot)mChart.getPlot();

        mPlot.setBackgroundPaint(Color.LIGHT_GRAY);

        mPlot.setRangeGridlinePaint(Color.BLUE);

        mPlot.setOutlinePaint(Color.RED);

 

        ChartFrame mChartFrame = new ChartFrame("sale valume", mChart);

        mChartFrame.pack();

        mChartFrame.setVisible(true);
		 if(view_states.hasWeek) {
			 DataProcessor.saveAsFile(mChart, "data/weeklyReport/salesvalumeChart.png", 800, 800); 
		 }

    }

}
