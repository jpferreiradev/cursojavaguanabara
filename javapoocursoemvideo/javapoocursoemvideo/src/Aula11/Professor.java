package Aula11;

public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    public void receberAumento(){
        this.salario++;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setEspecialidade(String especi) {
        this.especialidade = especi;

    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalario( double salario){
        this.salario = salario;
    }


}
