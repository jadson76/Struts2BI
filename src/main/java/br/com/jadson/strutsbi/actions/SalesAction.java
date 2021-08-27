package br.com.jadson.strutsbi.actions;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.jfree.chart.JFreeChart;

import br.com.jadson.strutsbi.DAO.SalesDAO;
import br.com.jadson.strutsbi.beans.Sales;
import br.com.jadson.strutsbi.charts.SalesChart;

public class SalesAction {
	
	
	private SalesDAO salesDAO = new SalesDAO();
	private Map<String,Sales> salesMap;
	private JFreeChart chart;
	
	
	public final Map<String, Sales> getSalesMap() {
		return salesMap;
	}

	public final void setSalesMap(Map<String, Sales> salesMap) {
		this.salesMap = salesMap;
	}
	
	public JFreeChart getChart() {
		return chart;
	}

	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}	

	public String list6monthSales() {
		List<Sales> sales;
		try {
			sales = salesDAO.getLast6MonthSales();
			salesMap = new LinkedHashMap<String,Sales>();
			for(Sales s : sales) {
				salesMap.put(s.getMonth(),s);
			}
		} catch (SQLException e) {		
			e.printStackTrace();
		}		
		
		return "success";
	}
	
	public String createChart() {
		try {
			chart = new SalesChart().createSalesChart();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return "chartSuccess";
	}
	
	

}
