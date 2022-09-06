package Aula04;

public class Caneta {
    // Aqui estão os seus atributos
    private String modelo;
    private double ponta;
    private boolean tampada;
    private String cor;

    // Aqui estão os seus métodos construtores

    public Caneta(String m, String c, double p){ // Este é o método construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta (p);
        this.tampar();

    }

    // Aqui estão os seus métodos

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public double getPonta(){

        return this.ponta;
    }

    public void setPonta(double p) {
        this.ponta = p;

    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Sobre a caneta");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor:" + this.cor);
        System.out.println("Tampada: " + this.tampada);
        //System.out.println("Teste");


    }

}
