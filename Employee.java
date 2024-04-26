package one_to_one_mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table

public class Employee {
	@Id
	private int eid;
	@Column(name="ename", length = 50)
	private String ename;
	@Column(name="salery")
	private double slaery;
	
	@Embedded
	public Account account;
	@Embedded
	public Education education;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="joincol")
	public GovernementAd adhar;
	
	
	public Employee()
	{
		//>>>>>>>>>>..
	}
	
	
	public Employee(int eid, String ename, String string, Account account, Education education, GovernementAd adhar) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.slaery = slaery;
		this.account = account;
		this.education = education;
		this.adhar = adhar;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getSlaery() {
		return slaery;
	}


	public void setSlaery(double slaery) {
		this.slaery = slaery;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public Education getEducation() {
		return education;
	}


	public void setEducation(Education education) {
		this.education = education;
	}


	public GovernementAd getAdhar() {
		return adhar;
	}


	public void setAdhar(GovernementAd adhar) {
		this.adhar = adhar;
	}
	
	
	
	
	
	
	
	

}
