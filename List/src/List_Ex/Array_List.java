package List_Ex;
import java.util.List;
import java.util.ArrayList;
public class Array_List {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(24);
		l.add(34);
		l.add("java");
		l.add("python");
		l.add(true);
		l.add(34);
		//allows duplicate
		//maintains order
		System.out.println("The size of arrayList is :"+l.size());
		System.out.println(l);
		System.out.println(l.get(0));

	}

}
