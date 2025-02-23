
/*
Write a Java program that calculates the area of a square using the formula
area = side * side. Use a predefined side length.




class Area{
	public static void main(String args[]) {
		int side = 5;
		side = side * side; 
		System.out.println("area of a square is :" + side);
	}
}

*/




import java.util.Scanner; 

class Area{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter area of square: ");
		int side = sc.nextInt();
		int area = side * side ;
		System.out.println("total area : " + area);
	}
}
