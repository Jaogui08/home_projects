package Projects;

import java.util.Scanner;

public class volume {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String continuar = "SIM";

        System.out.println("Bem-vindo à calculadora de volumes, siga os passos abaixo:");

        while (continuar.equalsIgnoreCase("SIM")) {
            System.out.print("\nInforme o valor do comprimento em metros: ");
            double comp = scanner.nextDouble();

            System.out.print("Informe o valor da largura em metros: ");
            double larg = scanner.nextDouble();

            System.out.print("Informe o valor da altura em metros: ");
            double alt = scanner.nextDouble();

            double area = comp * larg;
            double vol = area * alt;

            System.out.printf("O valor do volume é: %.2f m³\n", vol); 

            scanner.nextLine(); 

            System.out.print("\nGostaria de saber quantos litros seu objeto suporta? (sim/não): ");
            String esc = scanner.nextLine().toUpperCase();

            if (esc.equals("SIM")) {
                double litros = vol * 1000;
                System.out.printf("Seu objeto suporta %.2f litros\n", litros);
            } else {
                System.out.println("Continuando...");
            }

            System.out.print("\nDeseja fazer outro cálculo? (sim/não): ");
            continuar = scanner.nextLine().toUpperCase();
        }

        System.out.println("Fechando o sistema...");
        scanner.close();

	}

}
