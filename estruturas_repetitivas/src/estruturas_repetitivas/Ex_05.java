package estruturas_repetitivas;

// Calcular fatorial

import java.util.Scanner;

public class Ex_05 {
	
	public static void executar() {
		Scanner sc = new Scanner(System.in);
		int fat = sc.nextInt();
		int result = 1;
		
		for(int i = 1; i <= fat; i++) {
			result *= i;
		}
		
		System.out.println(result);
		sc.close();
	}

}
