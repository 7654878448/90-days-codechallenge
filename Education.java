package one_to_one_mapping;

import javax.persistence.Embeddable;

@Embeddable

public class Education {
	private String collegename;
	private String adress;
	
	public Education()
	{
		
	}
	
	
	
	public Education(String collegename, String adress) {
		super();
		this.collegename = collegename;
		this.adress = adress;
	}



	public String getCollegename() {
		return collegename;
	}



	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	
	
	
	

}
