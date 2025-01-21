package estruturas_condicionais;

import java.util.Scanner;

/*  Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.  */

public class Ex_03 {
	
	public static void executar() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a hora inicial: ");
		int horaInicio = sc.nextInt();
		System.out.print("Digite a hora final: ");
		int horaFim = sc.nextInt();
		int duracao;
		
		if (horaInicio < horaFim) {
			duracao = horaFim - horaInicio;
			System.out.println("Duração do jogo em horas: " + duracao);
		} else if (horaInicio > horaFim) {
			duracao = 24 - horaInicio + horaFim;
			System.out.println("Duração do jogo em horas: " + duracao);
		} else {
			System.out.println("O jogo durou 24 horas");
		}
		
		sc.close();
	}
}
