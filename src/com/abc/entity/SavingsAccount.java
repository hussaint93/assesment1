package com.abc.entity;

import java.util.Date;

public class SavingsAccount {
	private Long balance;
	private String ownerName;
	private String type;
	private Date date;
	private boolean status;
	public SavingsAccount(Long balance, String ownerName, String type, Date date, boolean status) {
		super();
		this.balance = balance;
		this.ownerName = ownerName;
		this.type = type;
		this.date = date;
		this.status = status;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getdate() {
		return date;
	}
}
