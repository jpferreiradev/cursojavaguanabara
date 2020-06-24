package primeiroprograma;

public class ComparacaoString {
	
	public static void main(String[] args) {
		
		String nome1 = "João";
		String nome2 = "João";
		String nome3 = new String("João");
		String res;
		
		res = (nome1.equals(nome3))?"igual":"diferente";
		System.out.println(res);
		
		
	}
}
