package com.md;

import java.sql.Date;

public class MDAccount_t {
	private String ID;
	private String PASSWORD;
	private String Name;
	private	int EMPLOYEE_ID;
	private Date CreateDate;
	
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String PASSWORD) {
		this.PASSWORD = PASSWORD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(int EMPLOYEE_ID) {
		this.EMPLOYEE_ID = EMPLOYEE_ID;
	}

	public Date getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(Date CreateDate) {
		this.CreateDate = CreateDate;
	}
	
}
