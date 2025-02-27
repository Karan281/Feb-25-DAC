/*
Next Step: Write a Java program that checks if a predefined number is positive using an
if-else statement and prints the appropriate message

*/

import java.util.Scanner;
class Checknumber{
	public static void main(String args[]) {
          	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = sc.nextInt();


		if (number > 0) {
			System.out.println("Positive Number");
		}else{
			System.out.println("Negative Number");
		 }
	}
}






/*
class Checknumber{
	public static void main(String args[]) {
	        int number = 11;
		if (number > 0) {
			System.out.println("Positive Number");
		}else{
			System.out.println("Negative Number");
		 }
	}
}

*/