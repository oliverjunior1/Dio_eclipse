package tonniJavaAndAiInEurope;

import java.util.Scanner;

public class ATabTypedNumber {

	public static void main(String[] args) {
		// put the input and the number
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Put the number to see the tab: ");
			int number = sc.nextInt();
			
			// Doing the tab from 1 to 10
			for(int i=0;i<=10;i++) {
				int multiply = i * number;
				System.out.printf("%d X %d = %d %n", i, number, multiply);
			}
		}

	}

}
