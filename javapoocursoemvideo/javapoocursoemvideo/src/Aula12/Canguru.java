package Aula12;

// Nos temos um terceiro nível de herança
public class Canguru extends Mamifero {


    @Override
    public void locomover() {
        System.out.println("Saltando");
        //super.locomover();
    }
    public void usarBolsa(){
        System.out.println("Usar bolsa");
    }

}
