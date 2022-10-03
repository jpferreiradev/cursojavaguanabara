package Aula12;

public class Peixe extends Animal {

    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
        //super.locomover();
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
        //super.alimentar();
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
        //super.emitirSom();
    }

    // Exemplo de herança para diferença
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");

    }

}
