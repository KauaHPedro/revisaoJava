package estruturas_repetitivas;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Exercício a ser executado: ");
		
		int ex = sc.nextInt();
		
		switch(ex) {
			case 1:
				Ex_01.executar();
				break;
			case 2:
				Ex02.executar();
				break;
			case 3:
				Ex_03.executar();
				break;
			case 4:
				Ex_04.executar();
				break;
			case 5:
				Ex_05.executar();
				break;
			case 6:
				Ex_06.executar();
				break;
			default:
				System.out.println("Exercício inválido");
		}
		
		sc.close();
		
	}

}