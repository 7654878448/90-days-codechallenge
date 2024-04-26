package one_to_one_mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adharDetails")

public class GovernementAd {
	@Id
	private int adharno;
	private String name;
	private String adress;
	
	
	public GovernementAd()
	{
		//conctructor for hibernate used>>
	}
	
	public GovernementAd(int adharno, String name, String adress) {
		super();
		this.adharno = adharno;
		this.name = name;
		this.adress = adress;
	}

	public int getAdharno() {
		return adharno;
	}

	public void setAdharno(int adharno) {
		this.adharno = adharno;
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
	
	
	
	
	
	

}
