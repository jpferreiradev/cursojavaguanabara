package Aula10;

public class Aluno extends Pessoa{

    private int matricula;
    private String curso;


    public void cancelarMatr(){

    }

    public int getMatr(){
        return this.matricula;
    }
    public void setMatricula(int matr){
        this.matricula = matr;
    }

    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String cur){
        this.curso = cur;
    }


}
