package br.com.jadson.strutsbi.charts;

import java.sql.SQLException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import br.com.jadson.strutsbi.DAO.SalesDAO;
import br.com.jadson.strutsbi.beans.Sales;

public class SalesChart {
	
	SalesDAO sDAO = new SalesDAO();
	
	public JFreeChart createSalesChart() throws SQLException {
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		List<Sales>sales =  sDAO.getLast6MonthSales();
		
		for(Sales s : sales) {
			dataset.addValue(s.getTotal(),"Sales", s.getMonth());
		}
		
		JFreeChart chart = ChartFactory.createLineChart3D(
				"Last 6 Month Sales",
				"Months",
				"Totals",
				dataset,
				PlotOrientation.VERTICAL,
				false,
				true,
				false);
		
		return chart;
		
	}

}
