package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams1 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3,4,5,7);
		System.out.println(list);
		
		//map method in streams
		Set<Integer> newSet=list.stream().map(n->n*n).collect(Collectors.toSet());
		System.out.println(newSet);
		
		List<Integer> newList=list.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(newList);
		
		
		//Create list of names
		List<String> names=Arrays.asList("Saikumar","Duvva","Rohan","StarkS");
		System.out.println(names);
		//List<String> listNames=names.stream().filter(x->x.charAt(2)).collect(Collectors.toList());
		//System.out.println(listNames);
		
		
	}

}
