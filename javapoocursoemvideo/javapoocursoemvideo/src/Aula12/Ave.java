package Aula12;

public class Ave extends Animal {

    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
        //super.locomover();
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
        //super.alimentar();
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
        //super.emitirSom();
    }

    //Exemplo de herança para diferença
    public void fazerNinho(){
        System.out.println("Fazendo um ninho");
    }
}
