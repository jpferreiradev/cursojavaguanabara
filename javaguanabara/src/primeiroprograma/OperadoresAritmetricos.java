package primeiroprograma;

public class OperadoresAritmetricos {
	
	public static void main(String[] args) {
		
		/*int n1 = 5;
		int n2 = 6;
		float m = (n1 + n2) / 2;
		System.out.println("A sua média geral é: " + m);*/
		
		int numero = 5;
		numero++;
		System.out.println(numero);
		
		int numero2 = 5;
		numero2--;
		System.out.println(numero2);
		
		int numero3 = 10;
		int valor = 5 + numero3++; // posdecremento
		//int valor = 5 + --numero3; // predecremento 
		System.out.println(valor);
		System.out.println(numero3); 
	
		int x = 4;
		x += 2; // x = x + 2
		System.out.println(x);
	
	}
}
