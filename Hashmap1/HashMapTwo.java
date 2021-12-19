package Hashmap1;

import java.util.HashMap;


public class HashMapTwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1,"Vinod");
		hashmap.put(2, "vivek");
		hashmap.put(3,"Vicky");
		hashmap.put(4,"akshay");
		hashmap.put(5,"vardha");
		System.out.println("first tree map is:"+hashmap);
//2. Write a Java program to count the number of key-value (size) mappings in a map.		
		System.out.println("first tree map is:"+hashmap.size());
		//Write a Java program to get a shallow copy of a HashMap instance.
		HashMap<Integer,String> newhashmap= new HashMap<Integer,String>(); 
		   newhashmap = (HashMap)hashmap.clone();     
		   System.out.println("Cloned map: " + newhashmap);  

		
	}
}