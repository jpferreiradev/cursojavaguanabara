package Aula10;

public class Professor extends Pessoa{

    private String especialidade;
    private double salario;

    public void receberAum(double aum){
        this.salario =+ aum;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setEspecialidade(String espe){
        this.especialidade = espe;
    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double sala){
        this.salario = sala;
    }



}
