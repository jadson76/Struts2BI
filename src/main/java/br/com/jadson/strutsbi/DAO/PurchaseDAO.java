package br.com.jadson.strutsbi.DAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.jadson.strutsbi.beans.Purchase;

public class PurchaseDAO {

	public List<Purchase> getLastMonthPurchases() {
		List<Purchase> lastMonth = new ArrayList<Purchase>();
		lastMonth.add(new Purchase("123456",new Date(),"Pencil","5000"));
		lastMonth.add(new Purchase("123457",new Date(),"Book","2000"));
		lastMonth.add(new Purchase("123458",new Date(),"eraser","15000"));
		return lastMonth;
	}

	public List<Purchase> getActualMonthPurchases() {
		List<Purchase> actualMonth = new ArrayList<Purchase>();
		actualMonth.add(new Purchase("123456",new Date(),"Pencil","5000"));
		actualMonth.add(new Purchase("123457",new Date(),"Book","2000"));
		actualMonth.add(new Purchase("123458",new Date(),"eraser","15000"));
		return actualMonth;
	}

	public List<Purchase> getYearPurchases() {
		List<Purchase> year = new ArrayList	<Purchase>();
		year.add(new Purchase("123456",new Date(),"Pencil","5000"));
		year.add(new Purchase("123457",new Date(),"Book","2000"));
		year.add(new Purchase("123458",new Date(),"eraser","15000"));
		return year;
	}

}
