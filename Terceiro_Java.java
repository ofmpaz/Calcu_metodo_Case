package segundo_Projeto;

import java.util.Scanner;

public class Terceiro_Java {

	public static void main(String[] args) {
		//Usar switch case para criar uma calculadora 

		Scanner input = new Scanner (System.in);
		double n1, n2, res; 

		System.out.println("Infome os dois valores da opre��o: ");
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		System.out.println("Escolha a opera��o: "
				+ "\n (1) Adi��o"
				+ "\n (2) Subtra��o"
				+ "\n (3) Multiplica��o"
				+ "\n (4) Divis�o");
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
		
		default: System.out.println("Op��o inv�lida");
		}

	} 

}
