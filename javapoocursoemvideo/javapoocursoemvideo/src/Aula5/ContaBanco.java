package Aula5;

public class ContaBanco {


    // Aqui estão os atributos da classe ContaBanco
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;


    // Aqui estão os seus contrustores, métodos especiais

    public void estadoAtual() {
        System.out.println("------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo:" + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    // Construtor
    public ContaBanco() {
            /*
             this.setSaldo(0);
            this.setStatus(false);
            */

        saldo = 0;
        status = false;

    }

    // Aqui estão os metodos get e set ( métodos especiais)
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return dono;
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

    public boolean getStatus() {
        return status;
    }

    // Aqui estão os métodos  personalizados (especificos)  da classe ContaBanco
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
            //this.saldo = 50; - Não usar diretamente o atributo e sim o método
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
            //this.saldo = 150; - Não usar diretamente o atributo e sim o método

        }
        System.out.println("Conta aberta com sucesso!");
    }

        public void fecharConta () {
            if (this.getSaldo() > 0) {
                System.out.println("Conta não pode ser fechada porquer ainda tem dinheiro");
            } else if (this.getSaldo() < 0) {
                System.out.println("Conta não pode ser fechada pois tem débito");
            } else {
                this.setStatus(false);
                System.out.println("Conta fechada com sucesso");

            }
        }

        public void depositar ( double v){
            if (this.getStatus()) {
                //this.saldo = this.saldo + v; - Trabalhando diretamente com o uso dos atributos
                this.setSaldo(this.getSaldo() + v);
                System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
            } else {
                System.out.println("Impossível depositar em uma conta fecha da");
            }
        }
            public void sacar ( double v){
                if (this.getStatus()) {
                    if (this.getSaldo() >= v) {
                        this.setSaldo(this.getSaldo() - v);
                        System.out.println("Saque realizado na conta de " + this.getDono());
                    } else {
                        System.out.println("Saldo insuficiente para saque ");
                    }
                } else {
                    System.out.println("Impossível sacar de uma conta fechada");
                }
            }


        public void pagarMensal() {
            int v = 0;

            if (this.getTipo() == "CC") {
                v = 12;
            } else if (this.getTipo() == "CP") {
                v = 20;
            }
            if (this.getStatus()) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Impossível pagar uma conta fechada!");
            }
        }

    }


