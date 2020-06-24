package primeiroprograma;

public class ClassaMath {

	public static void main(String[] args) { 
		
		float a = 8.9f;
		int ar = (int) Math.floor(a);
		System.out.println(ar);
		
		float b = 8.9f;
		int ar2 = (int) Math.round(b);
		System.out.println(ar2);
		
		// Gerador de números
		double ale = Math.random();
		int n = (int) (15 + ale * (50-15));
		System.out.println(n);
	
	}

}
