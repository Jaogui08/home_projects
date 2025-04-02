package Projects;

import java.util.Scanner;

public class caixa_senha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double saldo = 1000.0;
		String senha = "123456";

		while (true) {
			System.out.print("Bem-vindo ao caixa eletrônico, informe sua senha para continuar: ");
			String senhauser = scanner.nextLine();

			if (senhauser.equals(senha)) {
				break;
			} else {
				System.out.println("Senha incorreta, tente novamente");
			}
		}

		while (true) {
			System.out.println("\n1 - Consultar saldo");
			System.out.println("2 - Depositar");
			System.out.println("3 - Sacar");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");
			int opc = scanner.nextInt();

			switch (opc) {
			case 1:
				System.out.println("Seu saldo atualmente é de: " + String.format("%.2f", saldo) + " reais");
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
				if (saque > saldo || saque < 0) {
					System.out.println("Valor solicitado insuficiente");
				} else {
					saldo -= saque;
					System.out.println("Saque realizado com sucesso");
				}
				break;
			case 4:
				System.out.println("Obrigado por usar o caixa eletrônico");
				scanner.close();
				return;
			default:
				System.out.println("Opção inválida, tente novamente");
			}

		}

	}
}
