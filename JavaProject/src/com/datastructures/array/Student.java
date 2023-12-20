package com.datastructures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Student {

	private int id;
	private String name;
	private int grade;
	private int gpa;
	private List<String> activity;
	private String gender;
	
	public Student(int id, String name, int grade, int gpa, List<String> activity, String gender) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
		this.activity = activity;
		this.gender = gender;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	/**
	 * @return the gpa
	 */
	public int getGpa() {
		return gpa;
	}
	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	/**
	 * @return the activity
	 */
	public List<String> getActivity() {
		return activity;
	}
	/**
	 * @param activity the activity to set
	 */
	public void setActivity(List<String> activity) {
		this.activity = activity;
	}
	
	// map = name - key and value = activity
	
	
	
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Tenistable");
		l1.add("Cricket");
		l1.add("Footbol");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("Ludoo");
		l2.add("Chess");
		l2.add("Snake Ludoo");
		
		List<String> l3 = new ArrayList<String>();
		l3.add("Sketing");
		l3.add("Driving");
		l3.add("Runing");
		
		List<Student> list = Arrays.asList(new Student(101, "Dbc", 1, 10,l1, "Male"),
				new Student(102, "BCD", 2, 20,l2, "Male"),
				new Student(103, "ACD", 2, 20,l3, "Female"));
		
		//Convert Student of name into List of activity
		System.out.println("Convert Student of name into List of activity");
		Map<String, List<String>> maps = list.stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivity));
		
		System.out.println(maps);
		System.out.println();
		
		//list of student - based on sorted name
		System.out.println("list of student - based on sorted name");
		List<Student> collect = list.stream().sorted((s1,s2) -> s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println();
		
		//multiply all number - result - 120
		System.out.println("multiply all number - result - 120");
		int mul = IntStream.range(1, 6).reduce(1, (a,b) -> a*b);
		System.out.println(mul);
		System.out.println();
	
		//gender by list of student 
		System.out.println("gender by list of student");
		Map<Boolean, List<Student>> collect2 = list.stream().collect(Collectors.partitioningBy(c -> c.getGender().equals("Male")));
		System.out.println(collect2);
		System.out.println();
		
		// to upper case
		System.out.println("to upper case");
		List<String> upper = list.stream().map(m -> m.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(upper);
		
		//sort based on activity
		System.out.println();
		System.out.println("sort based on activity");
		List<String> collect3 = list.stream().map(Student::getActivity).flatMap(List::stream).sorted().collect(Collectors.toList());
		System.out.println(collect3);
		System.out.println();
		
		System.out.println();
		System.out.println("Two Sum");
		int[] res = getSum();
		System.out.println(Arrays.toString(res)); 
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", gpa=" + gpa + ", activity=" + activity
				+ ", gender=" + gender + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activity == null) ? 0 : activity.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + gpa;
		result = prime * result + grade;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (activity == null) {
			if (other.activity != null)
				return false;
		} else if (!activity.equals(other.activity))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (gpa != other.gpa)
			return false;
		if (grade != other.grade)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	private static int[] getSum() {
		int[] nums = {1,2,3,4,5};
		int sum = 7;
		int[] res = new int[2];
		
		int l = Integer.MAX_VALUE;
		int h = Integer.MIN_VALUE;
		
		for(int i = 0; i<nums.length; i++) {
			l = Math.min(l, nums[i]);
			h = Math.max(h, nums[i]);
		}
		
		int[] H = new int[10];
		
		for(int i=0; i< nums.length; i++) {
			int a = nums[i];
			if(sum - a < 0) {
				continue;
			}
			int b = sum - nums[i];
			if(H[b] != 0) {
				System.out.println(a+" + "+b+" = "+sum);
				res[0] = nums[i];
				res[1] = sum - nums[i];
			}
			
			H[a]++;
		}
		return res;
	}
	
}
