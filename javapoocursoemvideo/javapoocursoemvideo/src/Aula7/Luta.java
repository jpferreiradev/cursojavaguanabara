package Aula7;

public class Luta {

    // Aqui estão os seus atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos públicos

    public void marcarLuta(Lutador l1,l2){
    if(l1.getCategoria() == l2.getCategoria()){
        else if(l1 != l2 ){
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        } else {
           aprovada = false;
           desafiado = null;
           desafiante = null;
        }
    }
    }
    public void lutar(){
        if(aprovada){
        desafiado.apresantar();
        desafiante.apresantar();
        vencedor = Random(0..2);
        switch (vencedor){
            case 0: //Empate
                System.out.println("Empatou!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                break;
            case 1: // Ganhou Desafiado
                System.out.println(desafiado.getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();
                break;
            case 2: // Ganhou Desafiante
                System.out.println(desafiante.getNome());
                desafiante.ganharLuta();
                desafiado.perderLuta();
                break;

        }
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }

    // Métodos especiais e o construtor

    public String getDesafiado(){
        return this.desafiado;
    }
    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }
    public String getDesafiante(){
        return this.desafiante;
    }
    public void setDesafiante(Lutador desa){
        this.desafiante = desa;
    }

    public int getRounds(){
        return this.rounds;
    }
    public void setRounds(int rou){
        this.rounds = rou;
    }
    public boolean getAprovada(){
        return this.aprovada;
    }
    public void setAprovada(boolean apro){
        this.aprovada = apro;
    }

}
