package string;

public class program1 {
	public static void main(String[]args)
	{
		/*String s="radhe";//first it will point to radhe and after addittion 
		of maa it will point some anoter address where radhe maa is store;
		it will not point to radhe it will break the link and point to radhemaa;
		String is immutable here after change of content it will change the ADRESS 
		 
		
		s=s+"maa";
		System.out.println(s);
		*/
		StringBuffer sb=new StringBuffer("Rock");
		System.out.println(sb);//here sb have othere adresss
		sb.append("Star");//here link is break
		//we can not directly add in string buffer we have to append then it wulll add
		//and with creation of objcet;
		System.out.println(sb);//here its a string buffer it will not change the 
		//because of muttable 
		
		//note:-string is immutable where as stringbuffer is an immmutable in nature in string buffer 
		//once we create an object of string buffer class it wull manuplate and will not chnage the adress
		//java will provide extra space to stringbuffer because java think if somebody string buffer definetily
		//in futere he have change his data ; 
		
		
		
				
	}

}
