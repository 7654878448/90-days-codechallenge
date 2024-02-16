package string;

public class buffer {
	private static String testttette;

	public static void main(String[]args)
	{
		StringBuffer sb=new StringBuffer("dsa");
		System.out.println(sb.length());
		System.out.println(sb.capacity());//by default string buffer will take 16 charecter space;
		String originalString = "Hello, World!";
		sb.append("nahi karna hai filhal");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append( 2022);
		System.out.println(sb);
		//char ;
		sb.setCharAt(3,'l');
		//sb.append("teete");
		System.out.println(sb.length());
		System.out.println(sb);
		sb.delete(20, 28);
		System.out.println(sb);
		 sb.reverse();
		 
		System.out.println("after reverse the charecter of sb->" +sb);
		sb.replace(10, 20, "testttette");
		System.out.println(sb);
		

        // Convert the string to a char array
       // char[] charArray = originalString.toCharArray();

        // Display each character in the char array
      //  for (char c : charArray) {
         //   System.out.println(c);
        }
	}
	


