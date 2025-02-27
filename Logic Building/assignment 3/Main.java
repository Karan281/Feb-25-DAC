public class Main {
	public static void main(String[] args) {
		int n = 50;
		int sum = 0;
		for(int i=1;i<=n;i++){
			 sum = sum + i;

		}
		System.out.print(sum);
	}
}	




/*
public class Main {
    public static void main(String[] args) {
        int n = 50;
        int sum = 0;  // Initialize sum outside the loop

        // Corrected for loop with variable declaration
        for (int i = 1; i <= n; i++) {
            sum = sum + i;  // Accumulate sum
        }

        // Output the result
        System.out.print(sum);
    }
}
*/