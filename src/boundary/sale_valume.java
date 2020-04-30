package boundary;

import java.awt.Color;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;

import org.jfree.chart.ChartFrame;

import org.jfree.chart.JFreeChart;

import org.jfree.chart.plot.CategoryPlot;

import org.jfree.chart.plot.PlotOrientation;

import org.jfree.data.category.CategoryDataset;

import org.jfree.data.category.DefaultCategoryDataset;

public class sale_valume{

    public static void main(String[] args) {
    	sale_valume x = new sale_valume();
    	x.GetDataset();
    	   
    }

    public  void GetDataset()

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

                "sale volume",//图名字

                "day",//横坐标

                "number",//纵坐标

                mDataset,//数据集

                PlotOrientation.VERTICAL,

                true, // 显示图例

                true, // 采用标准生成器

                false);// 是否生成超链接

 

        CategoryPlot mPlot = (CategoryPlot)mChart.getPlot();

        mPlot.setBackgroundPaint(Color.LIGHT_GRAY);

        mPlot.setRangeGridlinePaint(Color.BLUE);//背景底部横虚线

        mPlot.setOutlinePaint(Color.RED);//边界线

 

        ChartFrame mChartFrame = new ChartFrame("sale valume", mChart);

        mChartFrame.pack();

        mChartFrame.setVisible(true);

    }

}
