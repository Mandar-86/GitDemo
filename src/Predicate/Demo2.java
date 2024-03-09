package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
	String ename;
	int salary;
	int experiance;
	
	Employee(String name, int sal, int exp)
	{
		ename=name;
		salary=sal;
		experiance=exp;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		
		//Ex.1emp object as paramter it should return name of employee if salary is greater than 30k and exp greater than 3
		Employee emp=new Employee("John",20000,2);
		
		Predicate<Employee> pr=e->(e.salary>30000 && e.experiance>3);
		System.out.println(pr.test(emp));
		
		//Ex.2
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("John",50000,5));
		al.add(new Employee("David",20000,2));
		al.add(new Employee("Scott",30000,3));
		al.add(new Employee("Mary",40000,6));
		
		for(Employee e:al) 
		{
			if(pr.test(e))
			{
				System.out.println(e.ename+" "+e.salary);
			}
		}
		
		

	}

}
