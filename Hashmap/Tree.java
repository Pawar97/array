//5. Write a Java program to get all keys from the given a Tree Map.
package Hashmap;

import java.util.Set;
import java.util.TreeMap;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();
		treemap.put(1,"Vinod");
		treemap.put(2, "vivek");
		treemap.put(3,"Vicky");
		treemap.put(4,"akshay");
		treemap.put(5,"vardha");
		System.out.println("first tree map is:"+treemap);
		//get all keys
		Set<Integer> keys=treemap.keySet();
				for(Integer key:keys) {
					System.out.println(key);
				}
				//6. Write a Java program to delete all elements from a given Tree Map.
				treemap.clear();
				System.out.println("first tree map is:"+treemap);
				// get the first (lowest) key and the last (highest) key currently in a map.
				System.out.println("Greatest key: " + treemap.firstKey());
				  System.out.println("Least key: " + treemap.lastKey());
				  
				  System.out.println("Orginal TreeMap content: " + treemap);
				  System.out.println("Reverse order view of the keys: " + treemap.descendingKeySet());
				}

}
