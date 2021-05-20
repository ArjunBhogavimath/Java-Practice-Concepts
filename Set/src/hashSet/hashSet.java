package hashSet;
import java.util.Set;
import java.util.HashSet;
public class hashSet {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(34);
		s.add(21);
		s.add(98);
		s.add(1);
		s.add(34);//cannot add duplicate
		System.out.println(s);

	}

}
