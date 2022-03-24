package segundo_Projeto;

import java.util.Scanner;

public class Terceiro_Java {

	public static void main(String[] args) {
		//Usar switch case para criar uma calculadora 

		Scanner input = new Scanner (System.in);
		double n1, n2, res; 

		System.out.println("Infome os dois valores da opreção: ");
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		System.out.println("Escolha a operação: "
				+ "\n (1) Adição"
				+ "\n (2) Subtração"
				+ "\n (3) Multiplicação"
				+ "\n (4) Divisão");
		int escolha = input.nextInt(); 
		switch (escolha) {
		case 1: res = n1 + n2; 
		System.out.println(res);
		break; 
		
		case 2: res = n1 - n2;
		System.out.println(res);
		break;
		
		case 3: res = n1 * n2;
		System.out.println(res);
		break;
		
		case 4: res = n1 / n2;
		System.out.println(res);
		break; 
		
		default: System.out.println("Opção inválida");
		}

	} 

}
