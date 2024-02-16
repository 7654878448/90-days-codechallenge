package string;
import java.util.*;

public class question1 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr your first String");
		String str=sc.nextLine();
		System.out.println("enter your Second String");
		String tec=sc.next();
		char x;
		int length=str.length();
		if(str.length()!=tec.length())
		{
			System.out.println("not a permutation");
		}
		int arr[]=new int[256];
		for(int i=0;i<length;i++)
		{
			x=str.charAt(i);
			arr[x]++;
			x=tec.charAt(i);
			arr[x]--;
		}
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]!=0)
					{
				System.out.println("not a permutation");
				return;
		        
				
					}
				
			
		}
		System.out.println("is a permutatatiion");
		
		
		
	}

}
/*
es, you can use break in place of return; if you want to exit the loop early, but keep executing the subsequent code outside the loop. However, there are important differences between break and return:

break: It is used to terminate the loop immediately and resume execution after the loop.

return: It is used to exit the entire method, not just the loop. When a return statement is encountered, the method stops executing, and the control is returned to the calling code.

Here's an example of using break:

java
Copy code
for (int i = 0; i < arr.length; i++) {
    if (arr[i] != 0) {
        System.out.println("Not a permutation");
        break; // Exit the loop
    }
}

// Code outside the loop will still be executed
System.out.println("Checking completed");
In this example, if arr[i] != 0, the loop will be terminated using break, but the subsequent code outside the loop will still be executed.

If you want to exit the entire method when
 a condition is met, then return; is appropriate. If you want to exit only the loop but continue with the method, then break; is suitable. Choose the one that aligns with your specific requirements.
*/