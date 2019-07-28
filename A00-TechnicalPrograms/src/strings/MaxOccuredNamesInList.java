package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MaxOccuredNamesInList {

	public static void main(String[] args) {
		//map creation
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		
		String[] names= {"Ramu","Raju","Sita","Ramu","Raju","Gits","Ramu","Raju","Raohan","Raohan","Raohan"};
		List listOfNames= Arrays.asList(names);
		//System.out.println(listOfNames);
		
		for(Object name:listOfNames) {
			//System.out.println(name);
			if(!map.containsKey(name)) {
				map.put((String) name, 1);
			}else {
				map.put((String) name, map.get(name)+1);
			}
		}//for

		System.out.println(map);
		//for getting max value from map
		int maxValueFromMap =Collections.max(map.values());
		System.out.println("Max value from map ::" +maxValueFromMap);
		TreeMap<String, Integer> sortedMap=new TreeMap<String,Integer>(map);
		
		for(Entry<String,Integer> entry:sortedMap.entrySet()) {
			if(maxValueFromMap == entry.getValue()) {
			
			System.out.println(entry.getKey()+"  :"+entry.getValue());
			}
		}
		
		
		
	}//main

}//class
