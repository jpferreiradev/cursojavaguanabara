package Aula2e3;

public class Caneta {
    // Cinco atributos

     public String modelo;
     public String cor;
     private double ponta;
     protected int carga;
     private boolean tampada;

    // Quatro métodos

    public void status(){
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);

    }

   public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    public void tampar(){
    this.tampada = true;

    }
    public void destampar(){
    this.tampada = false;

    }


}

