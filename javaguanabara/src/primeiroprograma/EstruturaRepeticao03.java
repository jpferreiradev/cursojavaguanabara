package primeiroprograma;

import java.util.Scanner;

public class EstruturaRepeticao03 {

	public static void main(String[] args) {
		int n, s = 0;
		String resposta;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Digite um número: ");
			n = teclado.nextInt();
			s += n; // s = s + n;
			System.out.print("Quer continuar? [S/N]");
			resposta = teclado.next();
		} while (resposta.equals("S"));
		System.out.println("A soma de todos os valores é " + s);

	}
}
