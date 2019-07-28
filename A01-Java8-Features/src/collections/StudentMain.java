package collections;


import java.awt.List;
import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		Student s=new Student(101, "saikumar");
		list.add(s);
		list.add(new Student(102, "Trishul"));
		list.add(new Student(103, "sandeep"));
		//System.out.println(list);
		//for loop iteration
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("========================");
		//enhanced for loop
		for(Student l:list) {
			System.out.println(l);
		}
		System.out.println("========================");
		//using lambda expression
		list.forEach((fff)->{
		System.out.println(fff);}
		);

	}//main

}//class
