package annotation_based_connection;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable

public class Account {
	@Column(name="accountNo",unique = true)
	private long accountNo;
	@Column(name="salary")
	private int salary;
	@Column(name="bankname",columnDefinition = "Varchar(50)" )
	private String bankname;
	public Account()
	{
		
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public Account(long accountNo, int salary, String bankname) {
		super();
		this.accountNo = accountNo;
		this.salary = salary;
		this.bankname = bankname;
	}
	

}
