package day3;
//empty array list
import java.util.*;
public class EmptyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		int n=l1.size();
		for(int i=0;i<n;i++) {
			System.out.println(l1.get(0));
			l1.remove(0);
		}
		// test array is empty or not 
n=l1.size();
System.out.print(n);
if(l1.isEmpty()) {
	System.out.println("list is empty");
}
if(n==0) {
	System.out.println("list is empty");
}
System.out.print(l1);
	}

}
