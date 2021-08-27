package br.com.jadson.strutsbi.actions;

import java.sql.SQLException;
import java.util.ArrayList;
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
	private String iniDate;
	private String endDate;
	
	
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

	public String getIniDate() {
		return iniDate;
	}

	public void setIniDate(String iniDate) {
		this.iniDate = iniDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String list6monthSales() {
		List<Sales> sales = new ArrayList<Sales>();	
		try {
			sales = salesDAO.getLast6MonthSales(iniDate,endDate);
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
			chart = new SalesChart().createSalesChart(iniDate,endDate);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return "chartSuccess";
	}
	
	

}
