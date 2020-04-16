package boundary;

import java.awt.Font;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;

public class spiciness_view{

	public static void main(String[] args) {
		spiciness_view pie = new spiciness_view();
		pie.piechart();
	}

	public void piechart() {
		// 创建数据集对象
		int sp0 = 0;
		int sp1 = 0;
		int sp2 = 0;
		int sp3 = 0;
		int sp4 = 0;
		int sp5 = 0;

				entity.DataProcessor user = new entity.DataProcessor("data/order.csv");
				ArrayList<String> number1 = user.Read();
				//get size of the file
				for(int j=0; j<number1.size(); j++) {
						String temp = number1.get(j);
						String[] str = temp.split(",");
						System.out.println(temp + " " + str[2]);
						if(str.length == 5){
							System.out.println("..................");
						}else{
							System.out.println(str[2]);
							if(str[7].equals("0")) {
								sp0++;
							}else if(str[7].equals("1")){
								sp1++;
							}else if(str[7].equals("2")) {
								sp2++;
							}else if(str[7].equals("3")) {
								sp3++;
							}else if(str[7].equals("4")) {
								sp4++;
							}else {
								sp5++;
							}
						}
						System.out.println(j);
				}
		 
				DefaultPieDataset dataset = new DefaultPieDataset();

				dataset.setValue("spiciness 0", sp0);
				dataset.setValue("spiciness 1", sp1);
				dataset.setValue("spiciness 2", sp2);
				dataset.setValue("spiciness 3", sp3);
				dataset.setValue("spiciness 4", sp4);
				dataset.setValue("spiciness 5", sp5);

				// 创建JFreeChart对象

				JFreeChart pieChart = ChartFactory.createPieChart("spiciness survey", // 标题

						dataset, // 数据集

						true, true, true);

		 

				// 设置字体属性

				PiePlot pieplot = (PiePlot) pieChart.getPlot(); // 通过JFreeChart对象获得plot

		 

				TextTitle textTitle = pieChart.getTitle(); // 标题设置

				textTitle.setFont(new Font("宋体", Font.PLAIN, 20));

		 

				pieChart.getLegend().setItemFont(new Font("宋体", Font.PLAIN, 12));//底部标签字体

		 

				StandardPieSectionLabelGenerator sp = new StandardPieSectionLabelGenerator("{2}");//{1}表示显示数值， {2}表示显示百分比

				pieplot.setLabelGenerator(sp);// 设置百分比

		 

				// 以swing的形式输出图表

				ChartFrame pieChartFrame = new ChartFrame("peiFrame", pieChart);

				pieChartFrame.setVisible(true);

				pieChartFrame.pack();

		 
	}

}

