package exerciciosJavaAulaSeis;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		float salario;
		float abono;
		float novo_salario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novo_salario = salario + abono;
		
		System.out.printf("Olá, o valor atualizado do salário é %.2f. ", novo_salario);
	}

}
