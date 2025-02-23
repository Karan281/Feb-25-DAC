/*
Write a Java program that checks if a predefined number is negative using an
if-else statement and displays the result

*/



import java.util.Scanner;
class Checknumber1{
	public static void main(String args[]) {
          	Scanner sc = new Scanner(System.in);
			
		int number = sc.nextInt();


		if (number < 0) {
			System.out.println("Negative Number");
		}else{
			System.out.println("Positive Number");
		 }
	}
}
