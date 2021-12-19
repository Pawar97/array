import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		Scanner sc= new Scanner(System.in);
		System.out.println("Leap year is:");
    year=sc.nextInt();
 if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
		System.out.println("Specified year is leap year");

		
	}else 
		System.out.println("Specified year is not leap year");
	}

}
