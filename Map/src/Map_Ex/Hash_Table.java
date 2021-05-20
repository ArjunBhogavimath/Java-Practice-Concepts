package Map_Ex;

import java.util.Hashtable;
import java.util.Map;

public class Hash_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> m = new Hashtable<>();
		m.put(0, 7);
		m.put(1, 74);
		m.put(2, 4);
		m.put(3, 54);
		m.put(4, 67);
		
		System.out.println(m.containsKey(4));
		System.out.println(m.get(3));
		

	}

}
