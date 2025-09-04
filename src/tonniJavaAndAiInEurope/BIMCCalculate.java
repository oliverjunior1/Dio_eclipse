package tonniJavaAndAiInEurope;

import java.util.Scanner;

public class BIMCCalculate {

	public static void main(String[] args) {
		// Generate a input weight and height
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the height: ");
		double height = sc.nextDouble();
		System.out.println("Type the weight: ");
		double weight = sc.nextDouble();
		
		// Make the calculation for the IMC
		double IMC = weight/(height*height);
		
		// use the if else to print like the result
		if(IMC<18.5) {
			System.out.println("Abaixo do peso");
		}else if(IMC>18.5&&IMC<=29.9) {
			System.out.println("Levemente acima do peso");
		
		}else if(IMC>29.9&&IMC<=34.9) {
			System.out.println("Obesidade grau 1");
	
		}else if(IMC>34.9&&IMC<=39.9) {
			System.out.println("Obesidade grau 2(Severa)");

		}else {
			System.out.println("Obesidade grau 3(Mórbida)");
		}

	}

}
