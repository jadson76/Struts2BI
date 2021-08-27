package br.com.jadson.strutsbi.beans;

public class Sales {
	
	private double total;
	
	private String month;	

	public Sales() {
		super();
	}

	public Sales(double total, String month) {
		super();
		this.total = total;
		this.month = month;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}



	

}
