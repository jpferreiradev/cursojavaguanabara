package Aula10;

public class Funcionario extends Pessoa{

    private String setor;
    private boolean trabalhando;

    public void mudarTraballho(){
        // Receber o inverso de trabalhando
        this.trabalhando = ! this.trabalhando;
    }

    public String getSetor(){
        return this.setor;
    }

    public void setSetor(String set){
        this.setor = set;
    }

    public boolean getTrabalhando(){
        return this.trabalhando;
    }
    public void setTrabalhando(boolean trabalha){
        this.trabalhando = trabalha;
    }

}
