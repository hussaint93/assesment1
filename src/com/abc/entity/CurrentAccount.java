package com.abc.entity;

import java.util.Date;

public class CurrentAccount {
	private Long balance;
	private String ownerName;
	private String type;
	private Date date;
	private boolean status;
	private Long overdraftBalance;
	public CurrentAccount(Long balance, String ownerName, String type, Date date, boolean status,
			Long overdraftBalance) {
		super();
		this.balance = balance;
		this.ownerName = ownerName;
		this.type = type;
		this.date = date;
		this.status = status;
		this.overdraftBalance = overdraftBalance;
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
	public Long getOverdraftBalance() {
		return overdraftBalance;
	}
	public void setOverdraftBalance(Long overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}
	public Date getdate() {
		return date;
	}
}
