package primeiroprograma;

import java.util.Scanner;

public class AnoDeNascimento {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o ano que você nasceu:");
		int AnoNascimento = teclado.nextInt();
		// System.out.println(AnoNascimento);
		System.out.println("Digite o ano atual: ");
		int AnoAtual = teclado.nextInt();
		// System.out.println(AnoAtual);
		int IdadeReal = (AnoAtual - AnoNascimento);
		System.out.println("A sua idade é: " + IdadeReal + " anos");
		/*
		 * if(IdadeReal){ System.out.println("A sua idade atual é:"); } else {
		 * System.out.println("Você não digitou a sua idade");
		 */
		
		

	
		
		
		
		
		
	}
}
