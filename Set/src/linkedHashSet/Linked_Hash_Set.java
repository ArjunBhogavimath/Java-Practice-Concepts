package linkedHashSet;

import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Linked_Hash_Set {

	public static void main(String[] args) {
		/*Set<Integer> s = new LinkedHashSet<>();
		s.add(34);
		s.add(21);
		s.add(98);
		s.add(1);
		s.add(34);//cannot add duplicate
		System.out.println(s);
*/
		List<Integer> l = new ArrayList<>();
		l.add(8);
		l.add(4);
		l.add(6);
		l.add(12);
		
		System.out.println(combineParts(l));
		

	}
	public static int combineParts(List<Integer> parts) {
	    // Write your code here
	    int len = parts.size();
	    Integer[] parts_array = new Integer[len];
	    parts_array = parts.toArray(parts_array);
	    
	    Arrays.sort(parts_array);
		
	   // for (int i=0;i<len;i++) { System.out.println(parts_array[i]); }
		 
	    int arr[] = new int[len-1];
	    int temp=0;
	    int z =0;
	    int ans=0;
	    
	    for(int i=0;i<len;i++){
	        if(temp==0){
	            temp+= parts_array[i]+parts_array[i+1];
	            arr[z] = temp;
	            i++;
	            z++;  
	        }
	        else {
	        temp+=parts_array[i];
	        arr[z]=temp;
	        z++;}
	        
	    }
	    for(int i=0;i<arr.length;i++){
	        ans+=arr[i];
	    }
	    //for (int i=0;i<len-1;i++) { System.out.println(arr[i]); }
	    return ans;
	    

	    }
}
