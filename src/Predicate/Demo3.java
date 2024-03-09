package Predicate;

import java.util.function.Predicate;

//Joining Predicates - and, or, negate
//p1 --checks number is even
//p2-- checks number is greater than 50 or not


public class Demo3 {

	public static void main(String[] args) {
		
		int a[] ={5,15,20,25,30,35,40,45,50,55,60,65};
		
		Predicate<Integer> p1=i->i%2==0;
		
		Predicate<Integer> p2=i->i>50;
		
		//and
		System.out.println("Followong are numbers EVEN & greater than 50");
	/*	for(int n:a)
		{
			// if(p1.test(n) && p2.test(n))
			if(p1.and(p2).test(n))  //--actual way to combine predicate
			{
				System.out.println(n);
			}
		} */
		
		//or
		
	/*	for(int n:a)
		{
			// if(p1.test(n) || p2.test(n))
			if(p1.or(p2).test(n))  //--actual way to combine predicate
			{
				System.out.println(n);
			}
		} */
		
		//negate
		
		for(int n:a)
		{
			// if(p1.test(n) || p2.test(n))
			if(p1.negate().test(n))  //--actual way to combine predicate
			{
				System.out.println(n);
			}
		}

	}

}
