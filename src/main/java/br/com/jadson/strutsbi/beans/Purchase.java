package br.com.jadson.strutsbi.beans;

import java.util.Date;

public class Purchase {
	
	private String purchaseNumber;
	
	private Date date;
	
	private String item;
	
	private double total;

	public Purchase(String purchaseNumber, Date date, String item, double total) {
		super();
		this.purchaseNumber = purchaseNumber;
		this.date = date;
		this.item = item;
		this.total = total;
	}

	public Purchase() {
		super();
	}

	public String getPurchaseNumber() {
		return purchaseNumber;
	}

	public void setPurchaseNumber(String purchaseNumber) {
		this.purchaseNumber = purchaseNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}



	
	
	

}
