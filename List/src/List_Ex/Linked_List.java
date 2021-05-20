package List_Ex;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(24);
		l.add(34);
		l.add("java");
		l.add("python");
		
		System.out.println(l);
		System.out.println(l.get(3));

	}

}
