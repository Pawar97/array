
public class SumoFNum {
	public static void main(String[] args) {
		int num;
		num=565;
int firstDigit = num % 10;
int remainingNumber = num / 10;
int SecondDigit = remainingNumber % 10;
remainingNumber = remainingNumber / 10;
int thirdDigit = remainingNumber % 10;
remainingNumber = remainingNumber / 10;
int fourthDigit = remainingNumber % 10;
int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
System.out.println("The sum of all digits in " + num + " is " + sum);
}
}