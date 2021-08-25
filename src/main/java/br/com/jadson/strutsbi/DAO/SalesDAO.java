package br.com.jadson.strutsbi.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.jadson.strutsbi.beans.Sales;

public class SalesDAO {
	
	public List<Sales> getLast6MonthSales() {
		List<Sales> lastMonth = new ArrayList<Sales>();
		lastMonth.add(new Sales(5000.00,"OUT"));
		lastMonth.add(new Sales(15000.00,"NOV"));
		lastMonth.add(new Sales(18000.00,"DEC"));
		lastMonth.add(new Sales(8900.00,"JAN"));
		lastMonth.add(new Sales(9200.00,"FEV"));
		lastMonth.add(new Sales(10000.00,"MAR"));
		
		return lastMonth;
	}

}
