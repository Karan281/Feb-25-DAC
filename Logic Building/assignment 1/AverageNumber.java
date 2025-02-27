import java.util.Scanner; 
class AverageNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		System.out.print("Enter Secong Number : ");
		int b = sc.nextInt();
		System.out.print("Enter Third Number : ");
		int c = sc.nextInt();
		int avg = (a + b + c)/3;
		System.out.print("final avg number : " + avg);
	}
}