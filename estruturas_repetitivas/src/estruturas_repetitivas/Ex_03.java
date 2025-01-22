package estruturas_repetitivas;

import java.util.Scanner;

/* Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso */

public class Ex_03 {
	
	public static void executar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
