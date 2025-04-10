package Projects;

import java.util.Scanner;

public class prova_gabarito {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continuar = "SIM";
		int totalalunos = 0;
		double totalnota = 0;
		
		String[] gabarito = {"A", "B", "C", "D", "E", "E", "D", "C", "B", "A"};
		
		while (continuar.toUpperCase().equals("SIM")) {
			totalalunos += 1;
			int acertos = 0;
			
			System.out.println("\nResponda as questôes abaixo: ");
			
			for (int i = 0; i < 10; i++) {
				System.out.print("Informe a resposta da questão " + (i+1) + ": ");
				String respostaaluno = scanner.nextLine().toUpperCase();
				
				if (respostaaluno.equals(gabarito[i])) {
					acertos++;
				}
			}
				totalnota = totalnota+acertos;
				
				System.out.println("Você acertou " + acertos + " questões e ficou com uma nota: " + acertos);
				
				System.out.print("\nOutro aluno irá utilizar o sistema? (sim/não) ");
				continuar = scanner.nextLine();
			}
			System.out.println("Total de alunos que utilizaram o sistema: " + totalalunos);
			double medianotas = totalnota/totalalunos;
			System.out.println("A média da turma foi de: " + medianotas);
			
			scanner.close();
		}
		

	}


