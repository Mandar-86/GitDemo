package Predicate;

import java.util.function.Predicate;

//Predicate---> it has only one parameter and returns boolean
//use only if you one paramter and conditional checks in your program
public class Demo1 {

	public static void main(String[] args) {
		
		//Ex.1
		Predicate<Integer> p=i->(i>10);
		
		System.out.println(p.test(20)); //true
		System.out.println(p.test(5)); //false
		
		//Ex.2 :Check the length of string is greater than 4 or not.
		
		Predicate<String> pr=s->(s.length()>4);
		
		System.out.println(pr.test("welcome")); //true
		System.out.println(pr.test("xyz")); //false
		
		//Ex.3 Print array element whose size is greater than 4
		String names[]= {"David","Scott","Smith","John","Mary"};
		
		for(String name:names)
		{
			if(pr.test(name))
			{
				System.out.println(name);
			}
		}

	}

}
