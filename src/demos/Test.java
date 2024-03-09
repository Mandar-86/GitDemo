package demos;

@FunctionalInterface
interface Cab
{
	public void bookCab();
	
}

public class Test {

	public static void main(String[] args) {
		
		Cab cab=()-> System.out.println("Ola cab is booked....");
		cab.bookCab();

	}

}
