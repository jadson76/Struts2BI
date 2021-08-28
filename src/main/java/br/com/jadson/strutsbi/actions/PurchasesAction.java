package br.com.jadson.strutsbi.actions;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import br.com.jadson.strutsbi.DAO.PurchaseDAO;
import br.com.jadson.strutsbi.beans.Purchase;

public class PurchasesAction {
	
	private PurchaseDAO pDAO = new PurchaseDAO();
	
	private List<Purchase>lastMonth;
	private List<Purchase>actualMonth;
	private List<Purchase>year;	
	
	public final List<Purchase> getLastMonth() {
		return lastMonth;
	}
	public final void setLastMonth(List<Purchase> lastMonth) {
		this.lastMonth = lastMonth;
	}
	public final List<Purchase> getActualMonth() {
		return actualMonth;
	}
	public final void setActualMonth(List<Purchase> actualMonth) {
		this.actualMonth = actualMonth;
	}
	public final List<Purchase> getYear() {
		return year;
	}
	public final void setYear(List<Purchase> year) {
		this.year = year;
	}
	
	
	@SuppressWarnings("unchecked")
	public String execute() {
		Map session = (Map)  ActionContext.getContext().get("session");		
		try {
			setLastMonth(pDAO.getLastMonthPurchases());
			setActualMonth(pDAO.getActualMonthPurchases());
			setYear(pDAO.getYearPurchases());
			session.put("lastMonthPurchases",lastMonth);
			session.put("actualMonthPurchases",actualMonth);
			session.put("yearPurchases",year);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return "success";
	}
	
	

}
