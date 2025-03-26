package apps;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
//			Menu de opções
			System.out.println("\n--- Calculadora ---");
			System.out.println("1. Adição (+)");
			System.out.println("2. Subtração (-)");
			System.out.println("3. Multiplicação (*)");
			System.out.println("4. Divisão (/)");
			System.out.println("5. Sair");
			System.out.println("Escolha uma opção: ");
			
			int opcao = scanner.nextInt();
			
//			Sair do programa
			if (opcao == 5) {
				System.out.println("Encerrando a calculadora. Até logo!");
				break;
			}
			
			if (opcao < 1 || opcao > 4) {
				System.out.println("Opção inválida. Tente novamente!");
				continue;
			}
			
//			Solicitar números
			System.out.println("Digite o primeiro número: ");
			double num1 = scanner.nextDouble();
			
			System.out.println("Digite o segundo número: ");
			double num2 = scanner.nextDouble();
			
//			Realizar cálculo
			double resultado = 0;
			switch (opcao) {
				case 1:
					resultado = num1 + num2;
					System.out.println(num1 + " + " + num2 + " = " + resultado);
					break;
				case 2:
					resultado = num1 - num2;
					System.out.println(num1 + " - " + num2 + " = " + resultado);
					break;
				case 3:
					resultado = num1 * num2;
					System.out.println(num1 + " * " + num2 + " = " + resultado);
					break;
				case 4:
					if (num2 != 0) {
						resultado = num1 / num2;
						System.out.println(num1 + " / " + num2 + " = " + resultado);
					} else {
						System.out.println("Erro: Divisão por zero não é permitida!");
					}
					break;
			}
			
		}
		
		scanner.close();
	}

}
