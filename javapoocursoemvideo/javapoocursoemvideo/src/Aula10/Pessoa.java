package Aula10;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniv(){
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
    public void setIdade(int id){
        this.idade = id;
    }
    public String getSexo(){
        return this.sexo;

    }
    public void setSexo(String sx){
        this.sexo = sx;
    }

    // Estudar mais esse método
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
