package br.com.jadson.strutsbi.beans;

public class Sales {
	
	private double total;
	
	private String month;
	
	

	public Sales(double total, String month) {
		super();
		this.total = total;
		this.month = month;
	}

	public final double getTotal() {
		return total;
	}

	public final void setTotal(double total) {
		this.total = total;
	}

	public final String getMonth() {
		return month;
	}

	public final void setMonth(String month) {
		this.month = month;
	}
	
	

}
