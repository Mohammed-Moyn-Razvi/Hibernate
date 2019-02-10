package com.one_to_one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Passport_table")
public class PassportTable {

	@Id
	@Column(name="P_id")
	private int pid;
	@Column
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userid")
	private Usertable us;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Usertable getUs() {
		return us;
	}

	public void setUs(Usertable us) {
		this.us = us;
	}
	
	
	
	
	
	
}
