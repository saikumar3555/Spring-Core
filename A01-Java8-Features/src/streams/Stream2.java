package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {

	public static void main(String[] args) {
  
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(27);
		list.add(6);
		list.add(8);
		System.out.println("List values :: "+list);
		
		//sorted()
		Stream s=list.stream();
		System.out.println(s.sorted());
		
		
		//filter()
		List<Integer> l=list.stream().filter(number->number>5).collect(Collectors.toList());
		System.out.println("filter :: "+l);
		
		//map() method
		List l3=list.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println("map :: "+l3);
		
		//count() method
		long l1=list.stream().count();
		System.out.println("count :: "+l1);
		
		
		//sorted()
		List<Integer> l4=list.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted :: "+l4);
		
		//sorted()
		List<Integer> l5=list.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println("Customizes sorted(-,-) :: "+l5);
		
		//forEach()
		//list.stream().forEach(System.out::println);
		list.stream().filter(n->n>10).forEach(System.out::println);
		
		
		//min()
		Integer min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("min() :: "+min);
		
		//max()
		Integer max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("min() :: "+max);
		
		
		//toArray()
		Integer[] arr=list.stream().toArray(Integer[]::new);
		Stream.of(arr).forEach(System.out::println);
		
		//Stream.of()
		Stream sd=Stream.of(9,99,999,9999);
		sd.forEach(System.out::println);		
		
		
		
		
		
		
		
	}

}
