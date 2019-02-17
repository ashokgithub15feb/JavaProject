package com.durga.program.java8.revies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e = new Employee("Durga", 1001);
		System.out.println(e);
		
		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee("Durga", 2001));
		l.add(new Employee("Sunny", 2002));
		l.add(new Employee("Bunny", 2003));
		l.add(new Employee("Chinny", 2004));
		l.add(new Employee("Vinny", 2005));
		
		System.out.println(l);
		
		Comparator<Employee> c = (e1, e2) -> { 
			
			return  e1.getName().compareTo(e2.getName());
		};
		
		Collections.sort(l, c);
		
		System.out.println(l);
		
		/**
		 *  Employee [name=Durga, eno=1001]
		 *  
			[Employee [name=Durga, eno=2001], Employee [name=Sunny, eno=2002], 
			Employee [name=Bunny, eno=2003], Employee [name=Chinny, eno=2004], 
			Employee [name=Vinny, eno=2005]]
			
			[Employee [name=Bunny, eno=2003], Employee [name=Chinny, eno=2004], 
			Employee [name=Durga, eno=2001], Employee [name=Sunny, eno=2002], 
            Employee [name=Vinny, eno=2005]]

			[Employee [name=Bunny, eno=2003], Employee [name=Chinny, eno=2004], 
			Employee [name=Durga, eno=2001], Employee [name=Sunny, eno=2002], 
			Employee [name=Vinny, eno=2005]]
			
			[Employee [name=Bunny, eno=2003], Employee [name=Chinny, eno=2004], 
			Employee [name=Durga, eno=2001], Employee [name=Sunny, eno=2002], 
			Employee [name=Vinny, eno=2005]]
			
		 */
		
	}
}
