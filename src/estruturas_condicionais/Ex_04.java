package estruturas_condicionais;

import java.util.Scanner;

/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar. */

public class Ex_04 {

	public static void executar() {
		Scanner sc = new Scanner(System.in);
		double total = 0.00;
		
		System.out.printf("Digite o produto que você quer: 1 - Cachorro Quente%n2 - X-salada%n3 - X-bacon%n"
				+ "4 - Torrada%n5 - Refrigerante%n");
		int pedido = sc.nextInt();
		
		System.out.print("Digite a quantidade: ");
		int qtd = sc.nextInt();
		
		switch(pedido) {
		case 1:
			total = qtd * 4.00;
			break;
		case 2:
			total = qtd * 4.50;
			break;
		case 3:
			total = qtd * 5.00;
			break;
		case 4:
			total = qtd * 2.00;
			break;
		case 5:
			total = qtd * 1.50;
			break;
		default:
			System.out.println("Opção fora do meu");
		}
		
		System.out.println("TOTAL: R$ " + total);
		
		
		sc.close();
		
	}
	
}
