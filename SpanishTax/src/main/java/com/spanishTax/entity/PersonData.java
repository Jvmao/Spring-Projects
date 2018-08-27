package com.spanishTax.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="User_Info") //Define table
public class PersonData {
	//Columns to add in MySQL db
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Column(name="year")
	@NotNull
	int year;
	
	@Column(name="period")
	@NotNull
	int period;
	
	@Column(name="nif")
	@NotNull
	String nif;
	
	@Column(name="name")
	@NotNull
	String name;
	
	@Column(name="accured")
	@NotNull
	String accured;
	
	@Column (name="deduction")
	@NotNull
	String deduction;
	
	@Column (name="total")
	@NotNull
	String total;
	
	//Empty Constructor
	public PersonData() {}

	public PersonData(int id, @NotNull int year, @NotNull int period, @NotNull String nif, @NotNull String name,
			@NotNull String accured, @NotNull String deduction, @NotNull String total) {
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
		return "PersonData [id=" + id + ", year=" + year + ", period=" + period + ", nif=" + nif + ", name=" + name
				+ ", accured=" + accured + ", deduction=" + deduction + ", total=" + total + "]";
	}

	

	
	
	
	
	
	
	
}
