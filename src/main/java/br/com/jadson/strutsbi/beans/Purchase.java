package br.com.jadson.strutsbi.beans;

import java.util.Date;

public class Purchase {
	
	private String purchaseNumber;
	
	private Date date;
	
	private String item;
	
	private String total;

	public Purchase(String purchaseNumber, Date date, String item, String total) {
		super();
		this.purchaseNumber = purchaseNumber;
		this.date = date;
		this.item = item;
		this.total = total;
	}

	public final String getPurchaseNumber() {
		return purchaseNumber;
	}

	public final void setPurchaseNumber(String purchaseNumber) {
		this.purchaseNumber = purchaseNumber;
	}

	public final Date getDate() {
		return date;
	}

	public final void setDate(Date date) {
		this.date = date;
	}

	public final String getItem() {
		return item;
	}

	public final void setItem(String item) {
		this.item = item;
	}

	public final String getTotal() {
		return total;
	}

	public final void setTotal(String total) {
		this.total = total;
	}
	
	

}
