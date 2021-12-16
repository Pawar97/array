
public class EqalsIgnore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Stephen edwin King";
String s2="Walter Winchell";
String s3="stephen edwin king";
boolean equals1=s1.equalsIgnoreCase(s2);
boolean equals2=s1.equalsIgnoreCase(s3);
System.out.println("\""+s1+"\"equals\""+s2+"\"?"+equals1);
System.out.println("\""+s1+"\"equals\""+s3+"\"?"+equals2);

	}

}
