package estruturas_repetitivas;

/* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo. */

import java.util.Scanner;

public class Ex_06 {
	
	public static void executar() {
		Scanner sc = new Scanner(System.in);
		
		int linhas = sc.nextInt();
		
		for (int i = 1; i <= linhas; i++) {
			System.out.printf("%d %d %d%n", i, i * i, i * i *i);
		}
		
		sc.close();

		
	}
}
