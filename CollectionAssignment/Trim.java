package day3;
import java.util.*;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> L1=new ArrayList<String>();
		L1.add("vicky");
		L1.add("Vrunda");
		L1.add("salvika");
		L1.add("teja");
		System.out.println("Orignal Array:"+L1);
		System.out.println("let trim to size array:");
		L1.trimToSize();
		System.out.println(L1);

	}

}
