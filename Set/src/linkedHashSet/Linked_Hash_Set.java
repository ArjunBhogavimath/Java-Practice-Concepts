package linkedHashSet;

import java.util.Set;
import java.util.LinkedHashSet;

public class Linked_Hash_Set {

	public static void main(String[] args) {
		Set<Integer> s = new LinkedHashSet<>();
		s.add(34);
		s.add(21);
		s.add(98);
		s.add(1);
		s.add(34);//cannot add duplicate
		System.out.println(s);


	}

}
