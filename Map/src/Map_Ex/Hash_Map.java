package Map_Ex;
import java.util.Map;
import java.util.HashMap;
public class Hash_Map {

	public static void main(String[] args) {
		Map<Integer,Integer> m = new HashMap<>();
		m.put(0, 7);
		m.put(1, 74);
		m.put(2, 4);
		m.put(3, 54);
		m.put(4, 67);
		
		System.out.println(m.containsKey(4));
		System.out.println(m.get(3));
		
		
		
	}

}
