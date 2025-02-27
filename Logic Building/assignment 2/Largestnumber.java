/*

Write a Java program that finds and prints the largest of three predefined
numbers using if-else statements.

*/





class Largestnumber{
	public static void main(String[] args) {
		int a = 100 , b = 101 , c = 103;
		
		if( a > b && a > c){
			System.out.println("largest number = a : " + a);		
		}else if(b > c){
			System.out.println("largest number = b : " + b);
		}else{
			System.out.println("largest number = c : " + c);
			
		}
		
	}

}




