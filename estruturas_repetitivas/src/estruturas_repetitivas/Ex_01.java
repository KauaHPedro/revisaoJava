package estruturas_repetitivas;

import java.util.Scanner;

/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). */

public class Ex_01 {
	
	public static void executar() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a coordenada X: ");
		int pontoX = sc.nextInt();
		System.out.print("Digite a coordenada Y: ");
		int pontoY = sc.nextInt();
		
		while (pontoX != 0 && pontoY != 0) {
			if (pontoX > 0 && pontoY > 0) {
				System.out.println("Primeiro quadrante");
			} else if (pontoX < 0 && pontoY > 0) {
				System.out.println("Segundo quadrante");
			} else if (pontoX < 0 && pontoY < 0) {
				System.out.println("Terceiro quadrante");
			} else {
				System.out.println("Quarto quadrante");
			}
			
			System.out.print("Digite novamente as coordenadas X e Y: ");
			pontoX = sc.nextInt();
			pontoY = sc.nextInt();
		}
		
		sc.close();
		
	}

}
