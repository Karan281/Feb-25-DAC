/*
Write a Java program that checks if a predefined number is odd or even. Use
an if-else statement and the modulus operator (%) to determine whether the number is
divisible by 2 or not

*/




import java.util.Scanner;
class Checknumbers3{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
		if ( a%2 == 0) {
			System.out.println("Even Number");
		}else{
			System.out.println("Odd Number");
		 }
	}
}
