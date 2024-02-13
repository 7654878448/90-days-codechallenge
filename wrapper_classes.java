package notes;

public class wrapper_classes {
	/*
	 * In Java, primitive data types (like int, char, boolean, etc.) are simple and efficient for basic operations. However, they lack certain features
	 *  and functionalities that are sometimes needed, such as being used in collections (like lists or maps) or working with objects.

Wrapper classes are used to overcome these limitations by providing a way to treat primitive data types as objects. They "wrap" or
 encapsulate primitive data types into classes, allowing them to be used in scenarios where objects are required. Here are a 
 few reasons why wrapper classes are used in Java:

Nullable Values: Primitive types cannot be null, so when you need to represent the absence of a value, you can use the wrapper classes 
like Integer, Double, etc., which can be set to null.

java
Copy code
Integer nullableValue = null;
Generics in Collections: Wrapper classes are often used in Java collections (like ArrayList, HashMap, etc.) because these classes work with objects. 
For example, if you want to create a list of integers, you'd use ArrayList<Integer> instead of ArrayList<int>.

java
Copy code
ArrayList<Integer> numberList = new ArrayList<>();
numberList.add(42);
Object-oriented Features: Wrapper classes provide additional methods and functionalities that primitive types don't have. 
For instance, the Integer class has methods for converting strings to integers (parseInt) or getting the binary representation of an integer.

java
Copy code
String numberString = "123";
int convertedInt = Integer.parseInt(numberString);
In summary, wrapper classes are used in Java to bring object-oriented features to primitive data types, making them more versatile and compatible
 with various Java APIs and libraries.






	 */

}
