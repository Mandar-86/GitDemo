package demos;

@FunctionalInterface
interface Uber
{
	public String bookUber(String source,String destination);
	
}

/*class Ola implements Uber
{
	public void bookUber(String source,String destination)
	{
		System.out.println("Ola cab is booked from"+source+ "To" +destination);
	} 
} */

/*class Ola implements Uber
{
	public String bookUber(String source, String destination)
	{
		System.out.println("Ola cab is booked from\"+source+ \"To\" +destination");
		return("Price: 5000 Rs");
	}
} */


public class Test2 {

	public static void main(String[] args) {
		
	//	Uber ca=new Ola();
	/*	Uber ca=(source,destination)->System.out.println("Ola cab is booked from " +source+ "To" + destination);
		ca.bookUber("Hyd", "Mumbai"); */
		
		Uber cb=(source,destination)->{
			System.out.println("Ola cab is booked from " +source+ "To" + destination);
			return("Price: 5000 Rs");
		};
		
		System.out.println(cb.bookUber("Hyd", "Mumbai"));

	}

}
