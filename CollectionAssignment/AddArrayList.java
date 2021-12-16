package day3;
// add two array list
import java.util.ArrayList;

public class AddArrayList {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list1=new ArrayList<String>();
		
		list.add("vinod");
		list.add("Pawar");
		list.add("pallavi");
        list1.add("sahadev");
        list1.add("ram");
        list1.add("vicky");
        // add two arraylist
       list.addAll(list1);
        System.out.println("new list"+list);
        
       
        
	}

}

