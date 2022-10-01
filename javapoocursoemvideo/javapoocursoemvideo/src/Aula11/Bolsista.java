package Aula11;
// Temos uma sobreposição
public class Bolsista extends  Aluno{

    private double bolsa;

    public void RenovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade() {
        //super.pagarMensalidade(); Aqui ele repete o metodo ainda
        System.out.println( this.nome +" é bolsista! Pagamento facilitado");
        // Tirar essa dúvida, sobre o @Override...
    }

    public double getBolsa(){
        return this.bolsa;
    }
    public void setBolsa(double bol){
        this.bolsa = bol;
    }

}


