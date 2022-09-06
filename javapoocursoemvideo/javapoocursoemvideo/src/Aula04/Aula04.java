package Aula04;

public class Aula04 {
    public static void main(String args[]){

        Caneta c1 = new Caneta("Nic", "Amarela", 0.4);
        c1.status();

        Caneta c2 = new Caneta("KKK", "Laranja", 1.0);
        c2.status();
    }
}

/*

c1.setModelo("Bic");
//c1.modelo = "Bic"; // Acessando diretamente pelo atributo
c1.setPonta(0.5);
//c1.ponta = 0.5; // Acessando diretamente pelo atributo

 System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

        //System.out.println("O tamanho da ponta é: " + c1.getPonta());
 */