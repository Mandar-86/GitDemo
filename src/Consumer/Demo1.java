package Consumer;

import java.util.function.Consumer;

public class Demo1 {

	public static void main(String[] args) {
		
		Consumer<String> c=s->System.out.println(s); 
		
		c.accept("WELCOME");
		c.accept("Java");
		c.accept("Selenium");

	}

}
