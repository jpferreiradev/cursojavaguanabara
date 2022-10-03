package Aula12;

public class Reptil extends Animal{


     private String corEscama;

     @Override
     public void locomover() {
          System.out.println("Rastejando");
          //super.locomover();
     }

     @Override
     public void alimentar() {
          System.out.println("Comendo vegetais");
          //super.alimentar();
     }

     @Override
     public void emitirSom() {
          System.out.println("Som de réptil");
          //super.emitirSom();
     }
}
