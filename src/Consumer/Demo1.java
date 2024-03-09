package Consumer;

import java.util.function.Consumer;

public class Demo1 {

	public static void main(String[] args) {
		
		Consumer<String> c=s->System.out.println(s); 
		
		c.accept("WELCOME");
		c.accept("Java");
		c.accept("Selenium");
		
		
		c.accept("Selenium");
		c.accept("python");
		c.accept("C#");
		c.accept("Grid");
		

		c.accept("Selenium2");
		c.accept("python2");
		c.accept("C#2");
		c.accept("Grid2");

	}

}
