package Aula11;

public class Aula11 {
    public static void main(String args[]){
        //Pessoa p1 = new Pessoa(); - Instanciamento do objeto errada porque a classe é abstrata.
        /*
        Visitante v1 = new Visitante();
        v1.setNome("JP");
        v1.setIdade(30);
        v1.setGenereoSexual("M");
        System.out.println(v1.toString());
        */
        Aluno a1 = new Aluno();
        a1.setNome("Paulo");
        a1.setMatricula(1111);
        a1.setCurso("Sistemas de informação");
        a1.setIdade(30);
        a1.setGenereoSexual("Masculino");
        a1.pagarMensalidade();

    }
}
