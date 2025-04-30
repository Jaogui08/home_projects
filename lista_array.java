package Projects;

import java.util.Scanner;

public class lista_array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] convidados = new String[5];
		
		for (int i=0; i<=4; i++) {
			System.out.print("Informe o nome da " + (i+1) + "° pessoa: ");
			convidados[i] = scanner.nextLine();
		}
		
		System.out.println("\nNomes recebidos:");
		for (int i=0; i<=4; i++) {
			System.out.println((i+1) + "° pessoa: " + convidados[i]);
		}
		
		
		System.out.print("\nDeseja consultar alguma pessoa? (sim/não) ");
		String opc = scanner.nextLine().toLowerCase();
		
		if (opc.equals("sim")) {
			while (true) {
				System.out.print("\nInforme o número da pessoa: ");
				int num = scanner.nextInt() -1;
				scanner.nextLine();
				
				if (num <= 4 && num >= 0) {
					System.out.println("O nome dessa pessoa é: " + convidados[num]);
					
					System.out.print("\nDeseja consultar outra pessoa? (sim/não) ");
					String opc2 = scanner.nextLine().toLowerCase();
					
					if (opc2.equals("sim")) {
						continue;
					} else {
						System.out.println("Fechando o sistema..");
						break;
					}
				} else {
					System.out.println("Número inválido");
				}
				
			}
		} else {
			System.out.println("Fechando o sistema..");
			scanner.close();
			
		}
		

	}

}
