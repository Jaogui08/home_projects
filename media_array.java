package Projects;

import java.util.Scanner;

public class media_array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] nomes = new String[4];
		double[] notas = new double[4];
		double[] notas2 = new double[4];
		double[] medias = new double[4];
		
		for (int i=0; i<=3; i++) {
			System.out.print("\nInforme o nome do " + (i+1) + "° aluno: ");
			nomes[i] = scanner.nextLine();
			System.out.print("Informe a primeira nota desse aluno: ");
			notas[i] = scanner.nextDouble();
			System.out.print("Informe a segunda nota desse aluno: ");
			notas2[i] = scanner.nextDouble();
			scanner.nextLine();
		}
		
		for (int i=0; i<=3; i++) {
			medias[i] = (notas[i] + notas2[i]) / 2;
		}
		
		System.out.println("\nMédias dos alunos:");
		int aprovado=0, reprovado=0;
		
		for (int i=0; i<=3; i++) {
			String msg = medias[i]>=7 ? " aluno aprovado" : " aluno reprovado";
			
			if (medias[i]>=7) {
				aprovado++;
			} else {
				reprovado++;
			}
			System.out.println(nomes[i] + " ficou com nota: " + medias[i] + "," + msg);
			System.out.println("");
		}
		
		System.out.println("Quantidade de alunos aprovados: " + aprovado);
		System.out.println("Quantidade de alunos reprovados: " + reprovado);
		
		scanner.close();

	}

}
