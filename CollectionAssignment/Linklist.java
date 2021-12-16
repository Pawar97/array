package day3;


import java.util.LinkedList;

public class Linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> L1=new LinkedList <Integer>();
		LinkedList <Integer> L2=new LinkedList <Integer>();
		L1.add(1);
		L1.add(2);
		L1.add(3);
		L1.add(4);
		L1.add(3,87);// add element  specified element
		L2.addFirst(100);//add element  first element
		L2.addLast(200);//add element  last element
		L2.add(115);
		L2.add(116);
		L2.add(117);
		int n=L1.size();
		System.out.println(n);
		System.out.println("Add element at specified position:"+L1);
		System.out.println("Add element at specified first & last position:"+L2);

	}

}
