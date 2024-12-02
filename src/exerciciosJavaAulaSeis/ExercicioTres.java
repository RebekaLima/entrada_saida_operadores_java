package exerciciosJavaAulaSeis;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		float salarioB;
		float noturno;
		float extra;
		float descontos;
		float salariol;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário bruto: ");
		salarioB = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		noturno = leia.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		extra = leia.nextFloat();
		
		System.out.println("Digite o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		salariol = salarioB + noturno + (extra * 5) - descontos;
		
		System.out.printf("Olá, o salário líquido é : %.2f. ", salariol);
	}

}
