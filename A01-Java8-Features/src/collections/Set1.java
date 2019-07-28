package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set1 {
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("Sai");
		set.add("Kumar");
		set.add(2);
		set.add("bhushan");
		set.add("ganesh");
		System.out.println(set);
		
		/*
		 * for(int i=0;i<set.size();i++) { System.out.println(set.get); }
		 */
		/*
		 * for(String s:set) { System.out.println(s); }
		 */
		 
		set.stream().forEach(
				
			System.out::println
				
				);
		
		//using iterator
		Iterator<Set> i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		 
		List<Integer> l=Arrays.asList(1,2,3,4);
		System.out.println(l);
	
		
		
		
	}

}
