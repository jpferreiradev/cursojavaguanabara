package Aula12;

// Nos temos um terceiro nível de herança
public class Canguru extends Mamifero {

    public void usarBolsa(){
        System.out.println("Usar bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
        //super.locomover();
    }
}
