/*

 Next Step: Write a Java program that calculates the area of a rectangle using the formula
area = length * width. Use predefined values for length and width.


class Areaofrectangle{
	public static void main(String args[]) {
		int width = 5;
		int length = 6;
		int Area = length * width; 
		System.out.println("area of a Rectangle is :" + Area);
	}
}



*/

import java.util.Scanner; 

class Areaofrectangle{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter length: ");
		
		

		int width = sc.nextInt();
		System.out.print(" Enter width: ");

		int length = sc.nextInt(); 
		int area = length * width;
		System.out.println("total area of ractangle : " + area);
	}
}
