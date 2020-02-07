
// procurar biblioteca resulução tela no java
package horadosistema;

import java.util.Date;
import java.util.Locale;
import java.awt.Dimension;
import java.awt.Toolkit;

public class HoraDoSistema {
	public static void main(String[] args) {
		
		Date relogio = new Date();
		System.out.println("A hora do sistema é");
		System.out.println(relogio.toString());
		
		Locale locale = Locale.getDefault();
		System.out.println("O idioma do SO é:");
		System.out.println("O idioma do SO é: " + locale.getDisplayLanguage());
		
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		int lar = (int) tela.getWidth();
		int alt = (int) tela.getHeight();
		System.out.println("Minha resolução de tela é :" + lar + "x" + alt);
		
		
	}
}
