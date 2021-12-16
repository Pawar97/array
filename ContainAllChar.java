import java.util.*;
public class ContainAllChar {

	static void CheckExistance(String str1,String str_to_search) {
		int chk=0;
	char chhr='';
		int[] a =new int[Character.MAX_VALUE + 1];
		
		for(int i=0;i<str_to_search.length();i++) {
			chhr=str1.charAt(i);
			++a[chhr];
		}
		for (int i=0;i<str_to_search.length();i++) {
			chhr=str_to_search.charAt(i);
			if(a[chhr] >= 1)
				chk=1;
		}
		if (chk == 1)
			System.out.println(str1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list=new ArrayList <String> ();
		list.add("rabbit");
		list.add("bribe");
		list.add("dog");
		System.out.println("the given strings are");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"");
		}
         System.out.println("\nthe given is: bib");
         System.out.println("\nthe string contaiing the letter of given word");
         for(int j=0;j<list.size();j++) {
        	 CheckExistance(list.get(j),"bib");
         }
         
	}

}




















