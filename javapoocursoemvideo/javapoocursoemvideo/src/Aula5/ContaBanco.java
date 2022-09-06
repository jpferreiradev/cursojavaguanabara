package Aula5;

public class ContaBanco {


        // Aqui estão os atributos da classe ContaBanco
        public int numConta;
        protected String tipo;
        private String dono;
        private double saldo;
        private boolean status;


        // Aqui estão os seus contrustores, métodos especiais

         public ContaBanco(){
             saldo = 0;
             status = false;
         }

        // Aqui estão os metodos get e set ( métodos especiais)
         public void setNumConta(int n){
            numConta = n;
        }
        public int getNumConta(){
            return this.numConta;
         }

         public void setTipo(String t){
             tipo = t;
         }
         public String getTipo(){
             return this.tipo;
         }

         public void setDono(String d){
             dono = d;
         }
         public String getDono(){
             return this.dono;
         }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus(){
             return status;
    }

    // Aqui estão os métodos ( especificos)  da classe ContaBanco
        public void abrirConta(String t) {
            setTipo(t);
            setStatus(true);
            if (t == "cc") {
                saldo = 50;
            } else if (t == "cp") {
                saldo = 150;
            }
            public void fecharConta () {
                if (saldo > 0) {
                    System.out.println("Conta com dinheiro");
                } else if (saldo < 0) {
                    System.out.println("Conta em débito");
                } else {
                    setStatus(false);
                }
            }
            public void depositar ( double v){
                if (status == true) {
                    setSaldo(getSaldo() + v); // Maneira correta a se fazer.
                    //saldo = saldo + v;
                } else {
                    System.out.println("Impossível depositar");
                }

                public void sacar ( double v){
                    if (status == true) {
                        if (getSaldo() > v) {
                            setSaldo() = getSaldo() - v;
                        } else {
                            System.out.println("Saldo insuficiente");
                        }
                    } else {
                        System.out.println("Impossível sacar");
                    }
                }

            }
            public void pagarMensal () {
                double v;
                if (tipo == "CC") {
                    v = 12;
                } else if (tipo == "CP") {
                    v = 20;
                }
                if(status == true){
                    if(saldo > v) {
                        saldo = saldo -v;
                    }  {
                        System.out.println("Saldo insuficiente");

                    }
                }

            }
        }
}