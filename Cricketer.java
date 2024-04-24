package annotation_based_connection;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cricketers1")

public class Cricketer {
	@Id
	 @Column(name= "jn")
	private int jn;
	 @Column(name= "playername")
	
	private String name;
	 @Column(name= "adress")
	private String adress;
	 @Column(name= "mobile")
	private long mobile;
	 @Column(name= "adhar")
	private long adhar;
	 @Column(name= "iplteam")
	private String iplteam;
	 @Embedded
	 private Account acc;
	 @Embedded
	 private Education edu;
	public Cricketer(int jn, String name, String adress, long mobile, long adhar, String iplteam, Account acc,
			Education edu) {
		super();
		this.jn = jn;
		this.name = name;
		this.adress = adress;
		this.mobile = mobile;
		this.adhar = adhar;
		this.iplteam = iplteam;
		this.acc = acc;
		this.edu = edu;
	}
	public Cricketer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getJn() {
		return jn;
	}
	public void setJn(int jn) {
		this.jn = jn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public long getAdhar() {
		return adhar;
	}
	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}
	public String getIplteam() {
		return iplteam;
	}
	public void setIplteam(String iplteam) {
		this.iplteam = iplteam;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public Education getEdu() {
		return edu;
	}
	public void setEdu(Education edu) {
		this.edu = edu;
	}
	
	

}
