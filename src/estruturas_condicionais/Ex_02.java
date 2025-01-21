package estruturas_condicionais;

import java.util.Scanner;

/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente. */

public class Ex_02 {
	
	public static void executar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite dois números inteiros para validar se são múltiplos: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();
	}

}
