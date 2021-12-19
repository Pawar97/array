//3. Write a Java program to search a key in a Tree Map.
//2. Write a Java program to copy one tree to another.
// 4.Write a Java program to search a value in a Tree
package Hashmap;

import java.util.TreeMap;

public class CopyMapTree {
public static void main(String[] args) {
	TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();
	treemap.put(1,"Vinod");
	treemap.put(2, "vivek");
	treemap.put(3,"Vicky");
	treemap.put(4,"akshay");
	treemap.put(5,"vardha");
	System.out.println("first tree map is:"+treemap);
	TreeMap<Integer,String> treemap1=new TreeMap<Integer,String>();
	treemap1.put(7, "Radha");
	treemap1.put(8, "raj");
	treemap1.put(9, "mona");
	System.out.println("first tree map is:"+treemap1);
	treemap.putAll(treemap1);//copy one to another
	System.out.println("After coping map2 to map1: "+treemap);   
	 // check tree contains key or not
	if(treemap.containsKey(5)) {
		System.out.println("Treemap keyContains key 5");
	}else {
			System.out.println(" Treemap key 5 dosent Contains");	
	}
	//search a value in a Tree
	if(treemap.containsValue("akshay")) {
		System.out.println("Treemap  contains value ");
		}else {
				System.out.println(" Treemap dosen't  contains value");	
		
	}
}  
}

