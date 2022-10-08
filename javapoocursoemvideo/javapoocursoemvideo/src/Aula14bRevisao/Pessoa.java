package Aula14bRevisao;

public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String generoSexual;
    protected double experiencia;

    public abstract void ganharExp();


    // Aqui está a o seu contrustor
    public Pessoa(String no,int id,String genero){
        this.nome = no;
        this.idade = id;
        this.generoSexual = genero;
        this.experiencia = 0;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public String getGeneroSexual(){
        return this.generoSexual;
    }
    public void setGeneroSexual(String genero){
        this.generoSexual = genero;
    }
    public double getExperiencia(){
        return this.experiencia;
    }
    public void setExperiencia(double exp){
        this.experiencia = exp;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", generoSexual='" + generoSexual + '\'' +
                ", experiencia=" + experiencia +
                '}';
    }
}
