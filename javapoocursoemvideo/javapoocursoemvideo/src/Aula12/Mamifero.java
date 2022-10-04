package Aula12;

public class Mamifero extends Animal {

    private String corPelo;

    @Override
    public void locomover() {
        //super.locomover();
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        //super.alimentar();
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        //super.emitirSom();
        System.out.println("Som de mamífero");
    }

    public String getCorPelo(){
        return this.corPelo;
    }
    public void setCorPelo(String pelo){
        this.corPelo = pelo;
    }

}




