package com.datastructures.blackrock.lru.lhmimpl;

public class LRUCachingDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1001, "Sam", 90000.0, "sam@intuit.com");
		Employee e2 = new Employee(1002, "John", 90000.0, "john@intuit.com");
		Employee e3 = new Employee(1003, "Jeemy", 90000.0, "jeemy@intuit.com");
		Employee e4 = new Employee(1004, "Shali", 90000.0, "shali@intuit.com");
		Employee e5 = new Employee(1005, "Shomy", 90000.0, "shomy@intuit.com");
		
		Department d1 = new Department(101, "IT", "Bangalore");
		Department d2 = new Department(102, "Finance", "Bangalore");
		
		LRUCacheUningLHMImpl<Employee, Department> cache = LRUCacheUningLHMImpl.newInstance(3);
		
		cache.put(e1, d1);
		cache.put(e2, d1);
		cache.put(e3, d1);
		
		cache.put(e4, d2);
		cache.put(e5, d2);
		Department department = cache.get(e4);
		System.out.println(department);
		cache.entrySet().forEach(entry -> System.out.println(entry.getKey()+":"+entry.getValue()));
		
	}
}
