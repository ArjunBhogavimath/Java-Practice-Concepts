package TreeSet;

import java.util.TreeSet;
import java.util.Set;

public class treeSet {

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<>();
		s.add(34);
		s.add(21);
		s.add(98);
		s.add(1);
		s.add(34);//cannot add duplicate
		//sorted
		System.out.println(s);


	}

}
