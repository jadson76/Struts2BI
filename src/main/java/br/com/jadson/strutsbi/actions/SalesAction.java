package br.com.jadson.strutsbi.actions;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import br.com.jadson.strutsbi.DAO.SalesDAO;
import br.com.jadson.strutsbi.beans.Sales;

public class SalesAction {
	
	
	private SalesDAO salesDAO = new SalesDAO();
	private Map<String,Sales> salesMap;
	
	
	public final Map<String, Sales> getSalesMap() {
		return salesMap;
	}

	public final void setSalesMap(Map<String, Sales> salesMap) {
		this.salesMap = salesMap;
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
	
	

}
