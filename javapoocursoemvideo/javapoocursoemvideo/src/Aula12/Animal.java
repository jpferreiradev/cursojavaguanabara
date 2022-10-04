package Aula12;

public abstract class Animal {
    // Atributos de animal
    protected double peso;
    protected int idade;
    protected int membros;

    // Métodos de animal
    public abstract void locomover();


    public abstract void alimentar();


    public abstract void emitirSom();


    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double pe){
        this.peso = pe;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public int getMenbros(){
        return this.membros;
    }
    public void setMembros(int men){
        this.membros = men;
    }



}





