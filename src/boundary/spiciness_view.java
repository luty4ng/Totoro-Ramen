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
import org.jfree.data.category.CategoryDataset;
import entity.DataProcessor;

/*** This class is data visualization
* @author Yujun Jin
* @version 0.5
*/
public class spiciness_view{

	public static void main(String[] args) {
		spiciness_view pie = new spiciness_view();
		pie.piechart();
	}

	public void piechart() {
		/**
		 * create frame
		 * @return none
		 */
		
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
						if(str.length != 5){
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
				}
				DefaultPieDataset dataset = new DefaultPieDataset();

				dataset.setValue("spiciness 0", sp0);
				dataset.setValue("spiciness 1", sp1);
				dataset.setValue("spiciness 2", sp2);
				dataset.setValue("spiciness 3", sp3);
				dataset.setValue("spiciness 4", sp4);
				dataset.setValue("spiciness 5", sp5);

			

				JFreeChart pieChart = ChartFactory.createPieChart("spiciness survey", 

						dataset, 

						true, true, true);

		 


				PiePlot pieplot = (PiePlot) pieChart.getPlot(); 

		 

				TextTitle textTitle = pieChart.getTitle(); 

				textTitle.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		 

				pieChart.getLegend().setItemFont(new Font("Times New Roman", Font.PLAIN, 12));

		 

				StandardPieSectionLabelGenerator sp = new StandardPieSectionLabelGenerator("{2}");

				pieplot.setLabelGenerator(sp);

		 

				

				ChartFrame pieChartFrame = new ChartFrame("peiFrame", pieChart);

				pieChartFrame.setVisible(true);

				pieChartFrame.pack();

		 if(view_states.hasWeek) {
			 DataProcessor.saveAsFile(pieChart, "data/weeklyReport/spicinessChart.png", 800, 800); 
		 }
	}

}

