package Aula11;

public class Aluno extends Pessoa{

    private int matricula;
    private String curso;

    public void PagarMensalidade(){

    }

    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int matri){
        this.matricula = matri;
    }

    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String cur){
        this.curso = cur;
    }

}
