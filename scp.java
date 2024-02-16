package string;

public class scp {
	public static void main(String[]args)
	{
		String s=new String("rahuie");
				String s2=new String("rahuie");
				//above two new creating string here three new string will mada 2 are in heap area and 1 one scp area
				
				System.out.println(s==s2);//this line of code will check the adress with double equals to
				System.out.println(s.equals(s2));//it will check the content inside the string;
				//so it will give the outpuut true 
				
				String str="Hello";
				String tre="hello";
				System.out.println(str==tre);//because of case sensititve output--false;
				System.out.println(str.equalsIgnoreCase(tre));//output--true;
				//it will give true because it avoid the case sensitive'
//avove code withought new it will store a string in scp area not in heap area duplicay is not allow above in heap
				//area thre twho copy of rahuie is made but in scp both were point to one adresss';
				
				
				
				
	}

}
