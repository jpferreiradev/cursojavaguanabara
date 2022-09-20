package Aula9b;

public class Pessoa {

    // Aqui estão os seus atributos
    private String nome;
    private int idade;
    private String sexo;


    // Métodos especiais e construtor

    public Pessoa(String no,int id,String sx){
        this.nome = no;
        this.idade = id;
        this.sexo = sx;
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
    public void setSexo(String se){
       this.sexo = se;
    }


    public void fazerAniver(){
        //this.idade = this.idade + 1;
        this.idade++;
   }
}


// Erros no código

// Errou no tipo do atributo, que é String