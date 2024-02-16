package program;



public class circle {
	double t ,s;
	double r;
	  double circumfirence(double r)
	 {
		 this.r=r;
		 return 2*3.14*r;
		 
	 }
	  double area(double r)
	 {
		 this.r=r;
		 return 22/7*r*r;
	 }
	 public static void main(String[]args)
	 {
		 circle c1=new circle();
		System.out.println( c1.area(30.4));
		System.out.println( c1.circumfirence(50.4));
		
			
	 }
	

}
