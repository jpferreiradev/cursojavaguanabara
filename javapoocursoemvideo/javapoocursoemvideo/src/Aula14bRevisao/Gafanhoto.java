package Aula14bRevisao;

public class Gafanhoto extends Pessoa{

    private String login;
    private int totalAssistido;


    public Gafanhoto(String nome,int idade, String generoSexual, String login) {
        super(nome,idade,generoSexual); // Exemplo como criar um construtor utilizando os atributos herdados da classe Pessoa
        this.login = login;
        this.totalAssistido = 0;
    }

    public String getLogin(){
        return this.login;
    }
    public void setLogin(String lo){
        this.login = lo;
    }
    public int getTotalAssistido(){
        return this.totalAssistido;
    }
    public void setTotalAssistido(int total){
        this.totalAssistido = total;


    }
    public void viuMaisUm(){
        totalAssistido++;
    }

    @Override
    public void ganharExp() {
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +super.toString()+
                "\nlogin='" + login + '\'' +
                ", totalAssistido=" + totalAssistido +
                '}';
    }
}
