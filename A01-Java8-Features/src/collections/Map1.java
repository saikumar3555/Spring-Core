package collections;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(101,"Ramesh");
		map.put(102,"Suresh");
		map.put(103,"Sohan");
		map.put(104,"Akbar");
		//System.out.println(map);
		
	for(Map.Entry<Integer, String> entry:map.entrySet()) {
		System.out.println(entry.getKey()+"    "+entry.getValue());}
		
	//using lambda expression
	map.forEach((k,v)->{System.out.println(k+"   "+v);});
		

	}//main

}//class
