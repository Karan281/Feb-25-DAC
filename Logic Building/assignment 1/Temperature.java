/*
//Write a Java program to convert a temperature from Celsius to Fahrenheit.
Test Data:
Input temperature in Celsius: 25
Formula: Fahrenheit = (Celsius * 9/5) + 32
Expected Output:
25°C is equal to 77.0°F


*/

import java.util.Scanner; 
class Temperature{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Celsius : ");
		double Celsius = sc.nextDouble();
		double Fahrenheit = (Celsius * 9/5) + 32;
		System.out.print(Fahrenheit + "F");
	}
}