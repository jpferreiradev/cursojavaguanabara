package Aula11;

public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String genereoSexual;

    public void fazerAni(){
        this.idade++;
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
    public void setIdade( int id){
        this.idade = id;
    }
    public String getGenereoSexual(){
        return this.genereoSexual;
    }
    public void setGenereoSexual(String sexo){
        this.genereoSexual = sexo;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genereoSexual='" + genereoSexual + '\'' +
                '}';
    }
}
