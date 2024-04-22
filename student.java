package hbn_first_project;

public class student {
	private int roll;
	private String name;
	private double marks;
	private String favsubject;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", favsubject=" + favsubject + "]";
	}
	 
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getFavsubject() {
		return favsubject;
	}
	public void setFavsubject(String favsubject) {
		this.favsubject = favsubject;
	}
	public student(int roll, String name, double marks, String favsubject) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.favsubject = favsubject;
	}

}
