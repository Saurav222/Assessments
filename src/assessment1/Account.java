package assessment1;

import java.util.Date;

public class Account {
	private long balance;
	private String ownerName;
	private String createDate;
	
	public Account(long balance, String ownerName, String createDate) {
		super();
		this.balance = balance;
		this.ownerName = ownerName;
		this.createDate = createDate;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
}


class SavingsAccount extends Account{
	private String Type = "Savings";
	public SavingsAccount(long balance, String ownerName,String createDate) {
		super(balance, ownerName, createDate);
	}
	public String getType() {
		return Type;
	}	
	
}


class CurrentAccount extends Account{
	private String Type = "Current";
	private double overdraftBalance;
	public CurrentAccount(long balance, String ownerName, String createDate) {
		super(balance, ownerName, createDate);
	}
	public String getType() {
		return Type;
	}
	public double getOverdraftBalance() {
		return overdraftBalance;
	}
	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}
}