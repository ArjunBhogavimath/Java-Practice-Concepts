package List_Ex;

import java.util.Vector;
import java.util.List;

public class Vector_List {

	public static void main(String[] args) {
		List l = new Vector();
		l.add(24);
		l.add(34);
		l.add("java");
		l.add("python");
		
		System.out.println(l);
		System.out.println(l.get(2));

	}

}
