package com.capgemini.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {

	@Id
	@Column(name="E_id")
	private int e_id;
	@Column(name="E_name")
	private String e_name;
	@Column(name="E_sal")
	private double e_salary;
	@Column(name="E_pass")
	private String e_password;
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public double getE_salary() {
		return e_salary;
	}
	public void setE_salary(double e_salary) {
		this.e_salary = e_salary;
	}
	public String getE_password() {
		return e_password;
	}
	public void setE_password(String e_password) {
		this.e_password = e_password;
	}
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_salary=" + e_salary + ", e_password=" + e_password
				+ "]";
	}
	
	
	
	
	
}
