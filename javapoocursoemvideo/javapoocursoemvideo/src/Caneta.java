public class Caneta {
    // Cinco atributos

    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    // Quatro métodos

    void status(){
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);

    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    void tampar(){
    this.tampada = true;

    }
    void destampar(){
    this.tampada = false;

    }


}

