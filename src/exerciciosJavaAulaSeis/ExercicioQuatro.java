package exerciciosJavaAulaSeis;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		float num1;
		float num2;
		float num3;
		float num4;
		float resultado1;
		float resultado2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num1 = leia.nextFloat();
		
		System.out.println("Digite um segunddo número: ");
		num2 = leia.nextFloat();
		
		System.out.println("Digite um terceiro número: ");
		num3 = leia.nextFloat();
		
		System.out.println("Digite um quarto número: ");
		num4 = leia.nextFloat();
		
		resultado1 = (num1 * num2) - (num3 * num4);
		resultado2 = (num1 * num2) - (-num3 * num4);
		
		System.out.println("O total da diferença entre os produtos é: %.1f. " + resultado1);
		System.out.println("O total da diferença entre os produtos é:: %.1f. " + resultado2);

	}

}
