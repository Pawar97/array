//1. Write a Java program to associate the specified value with the specified key in a Tree Map.
package Hashmap;

import java.util.Map;
import java.util.TreeMap;
public class SpeValWithKey {
	public static void main(String[] args) {
		TreeMap<Integer,String> Tree_map=new TreeMap<Integer,String>();
	Tree_map.put(1,"vinod");
	Tree_map.put(2,"pawar");
	Tree_map.put(3,"Pallvi");
	Tree_map.put(4,"salvika");
	Tree_map.put(5,"vrunda");
	for (Map.Entry<Integer,String> entry : Tree_map.entrySet())
	   {
	    System.out.println(entry.getKey() + "=>" + entry.getValue());
	   }
	
	
	
	}

}