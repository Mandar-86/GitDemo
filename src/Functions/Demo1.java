package Functions;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f=n->n*n;
		
		System.out.println(f.apply(5));
		System.out.println(f.apply(10));
		System.out.println(f.apply(2));
		
		//String length
		//String-->length-->int
		Function<String,Integer> fn=s->s.length();
		
		System.out.println(fn.apply("Java Programming"));
		System.out.println(fn.apply("welcome"));
		

	}

}
