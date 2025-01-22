package estruturas_repetitivas;

import java.util.Scanner;

/* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */

public class Ex_04 {
	
	public static void executar() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double primeiro = sc.nextDouble();
			double segundo = sc.nextDouble();
			
			if (segundo != 0.0) {
				System.out.println(primeiro / segundo);
			} else {
				System.out.println("Divisão impossível");
			}
		}
		
		sc.close();
	}

}
