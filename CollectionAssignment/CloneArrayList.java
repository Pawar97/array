package day3;
import java.util.*;
public class CloneArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list1.add(6);
		list1.add(7);
		list1.add(9);
		// cloned array list
		for(Integer list11:list) {
			list1.add(list11);
		}
			System.out.println("Cloned ArrayList is:"+list1);
			
		
	}

}
