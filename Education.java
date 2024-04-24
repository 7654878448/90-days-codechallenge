package annotation_based_connection;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable

public class Education {
	@Column(name="rollNo",unique = true)
	private int rollNo;
	@Column(name="collegename" ,length = 104)
	private String collegeName;
	
	public Education()
	{
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Education(int rollNo, String collegeName) {
		super();
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	
	

}
