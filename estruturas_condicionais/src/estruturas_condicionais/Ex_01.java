package estruturas_condicionais;

import java.util.Scanner;

public class Ex_01 {
	
	//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
	
	public static void executar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
		
		sc.close();
	}

}
