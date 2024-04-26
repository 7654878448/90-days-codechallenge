package one_to_one_mapping;

import javax.persistence.Embeddable;

@Embeddable

public class Account {
	private int accnumber;
	private String bankname;
	private double balance;
	
	public Account()
	{
		
	}
	
	public Account(int accnumber, String bankname, double balance) {
		super();
		this.accnumber = accnumber;
		this.bankname = bankname;
		this.balance = balance;
	}

	public int getAccnumber() {
		return accnumber;
	}

	public void setAccnumber(int accnumber) {
		this.accnumber = accnumber;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
