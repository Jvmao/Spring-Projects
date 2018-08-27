package com.spanishTax.model;

//PersonModel Object
public class PersonModel {
	private int id;
	private int year;
	private int period;
	private String nif;
	private String name;
	private String accured;
	private String deduction;
	private String total;
	
	public PersonModel() {}

	public PersonModel(int id, int year, int period, String nif, String name, String accured, String deduction,
			String total) {
		super();
		this.id = id;
		this.year = year;
		this.period = period;
		this.nif = nif;
		this.name = name;
		this.accured = accured;
		this.deduction = deduction;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccured() {
		return accured;
	}

	public void setAccured(String accured) {
		this.accured = accured;
	}

	public String getDeduction() {
		return deduction;
	}

	public void setDeduction(String deduction) {
		this.deduction = deduction;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "PersonModel [id=" + id + ", year=" + year + ", period=" + period + ", nif=" + nif + ", name=" + name
				+ ", accured=" + accured + ", deduction=" + deduction + ", total=" + total + "]";
	}

	
	

	
	
}
