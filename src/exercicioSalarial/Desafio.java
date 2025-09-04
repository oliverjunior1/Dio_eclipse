package exercicioSalarial;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double salary = sc.nextDouble();
		double salaryAcre = 0;
		double adicDeBeneficio = sc.nextDouble();
		if(salary>=0&&salary<=1100) {
			salaryAcre = (salary*0.95)+adicDeBeneficio;
		}
		else if(salary>1100.01&&salary<=2500) {
			salaryAcre = (salary*0.9)+adicDeBeneficio;
		}
		else {
			salaryAcre = (salary*0.85)+adicDeBeneficio;
		
		
		}
		System.out.println(salaryAcre);
	}

}
