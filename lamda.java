package java8features;

import java.util.function.Predicate;

@FunctionalInterface
interface myinterface{
	
	public void m1();
}

public class lamda {
	public static void main(String[]args)
	{
		myinterface m2=	()->System.out.println("m2method is called");
		m2.m1();
		Predicate<Integer>p =i->i>10;
		System.out.println(p.test(11));
		
	}

}
/* a functional interface has exactly one abstractmethod. Since default methods have an implementation, they are not abstract. Ifan interface declares an abstract method overriding one of thepublic methods of java.lang.Object,
 *  that also does not count toward the interface's abstract method countsince any implementation of the interface will have animplementation from java.lang.Object or elsewhere. 

Note that instances of functional interfaces can be created withlambda expressions, method references, 
or constructor references. 

If a type is annotated with this annotation type, compilers arerequired to generate an error message unless: 
• The type is an interface type and not an annotation type, enum, or class. 
• The annotated type satisfies the requirements of a functional interface. 

However, the compiler will treat any interface meeting thedefinition of a functional interface as a functional interfaceregardless of whether or not a FunctionalInterfaceannotation is present on the interface declaration.
Since:1.8@jls4.3.2 The Class Object@jls9.8 Functional Interfaces@jls9.4.3 Interface Method Body@jls9.6.4.9 @FunctionalInterface
 * 
 * 
 * 
 */
