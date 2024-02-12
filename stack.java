package collectionFramework;

import java.util.Stack;

public class stack {
public static void main(String[]args)
{
	Stack<Object> s1=new Stack();
	s1.push("hello");
	s1.add("hello ji");
	s1.push(10101);
	System.out.println(s1);
	System.out.println(s1.pop());
	System.out.println(s1.peek());
	System.out.println(s1.pop());
	
	
}
}
