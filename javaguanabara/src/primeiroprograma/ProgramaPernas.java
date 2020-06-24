// switch -> Escolha, se é isso for isso e se isso não for aquilo 

package primeiroprograma;

import java.util.Scanner;

public class ProgramaPernas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantas pernas?");
		int perna = teclado.nextInt();
		String tipo;
		System.out.println("Isso é um(a) ");
		switch (perna) {
		case 1:
			tipo = "Saci";
			break;
		case 2:
			tipo = "Bípede";
			break;
		case 3:
			tipo = "Tripé";
			break;
		case 4:
			tipo = "Quadrúpide";
			break;
		case 6:
			tipo = "Aranha";
			break;
		default:
			tipo = "ET";
			break;
		}

		System.out.print(tipo);
	}
}
