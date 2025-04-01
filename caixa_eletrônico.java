package Projects;

import java.util.Scanner;

public class caixa_eletrônico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double saldo = 1000.0;
		
		while (true) {
			System.out.println("\nBem-vindo ao caixa eletrônico");
			System.out.println("1 - Consultar saldo");
			System.out.println("2 - Depositar");
			System.out.println("3 - Sacar");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");
			int opc = scanner.nextInt();
			
			switch (opc) {
			case 1:
				System.out.println("Seu saldo atualmente é de: " + saldo + " reais");
				break;
			case 2:
				System.out.print("Digite o valor para o depósito: ");
				double deposito = scanner.nextDouble();
				if (deposito < 0) {
					System.out.println("Valor informado inválido");
				} else {
				    saldo += deposito;
				    System.out.println("Depósito realizado com sucesso");
				}
				break;
			case 3:
				System.out.print("Digite o valor para sacar: ");
				double saque = scanner.nextDouble();
				if (saque > saldo) {
					System.out.println("Valor solicitado insuficiente");
				} else {
					saque -= saldo;
					System.out.println("Saque realizado com sucesso");
				}
				break;
			case 4:
				System.out.println("Obrigado por usar o caixa eletrônico");
				scanner.close();
				return;
			default:
				System.out.println("Opção inválida, tente novamnete");
			}
			
		}

	}

}
