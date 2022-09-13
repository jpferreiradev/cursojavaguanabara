package Aula7;

public class Lutador {


        // Atributos
        private String nome;
        private String nacionalidade;
        private int idade;
        private double altura;
        private double peso;
        private String categoria;
        private int vitoria;
        private int derrota;
        private int empate;


        // Aqui estão os métodos públicos
        public void apresantar(){
                System.out.println("--------------------------------------");
                System.out.println("Chegou a hora! Apresentamos o lutador  " +  this.getNome());
                System.out.println("Diretamente de " + this.getNacionalidade());
                System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " metros de altura");
                System.out.println("pesando " + this.getPeso() + "Kg");
                System.out.println(this.getVitoria() + "vitórias");
                System.out.println(this.getDerrota() + "derrotas e ");
                System.out.println(this.getEmpate() + "empates!");
        }
        public void status(){
                System.out.println(this.getNome() + " é um peso " + this.getCategoria());
                System.out.println("Ganhou " + this.getVitoria() + " vezes");
                System.out.println("Perdeu " + this.getDerrota() + " vezes");
                System.out.println("Empatou " + this.getEmpate() + " vezes");
        }
        public void ganharLuta(){
                this.setVitoria(this.getVitoria() + 1);
                //this.vitoria = this.vitoria + 1; - Pode ser usado dessas duas formas, mas é bom aprender já usando usando os métodos get e set
        }
        public void perderLuta(){
                this.setDerrota(this.getDerrota() + 1);
        }

        public void empatarLuta(){
                this.setEmpate(this.getEmpate()+ 1);
        }

        // Aqui está o seu construtor e os métodos especiais
        public Lutador(String no,String na,int id,double al, double pe, int vi,int de,int em){
                this.setNome(no);
                this.nacionalidade = na;
                this.idade = id;
                this.altura = al;
                this.setPeso(pe);
                this.vitoria = vi;
                this.derrota = de;
                this.empate = em;


        }

        public String getNome(){
                return this.nome;
        }
        public void setNome(String no){
                this.nome = no;

        }

        public String getNacionalidade(){
                return this.nacionalidade;
        }
        public void setNacionalidade(String na){
                this.nacionalidade = na;
        }

        public int getIdade(){
                return this.idade;
        }
        public void setIdade(int id){
                this.idade = id;
        }

        public double getAltura(){
                return this.altura;
        }
        public void setAltura(double al){
                this.altura = al;
        }

        public double getPeso(){
                return this.peso;
        }
        public void setPeso(double pe){
                this.peso = pe;
                this.setCategoria();
        }

        public String getCategoria(){
                return this.categoria;
        }

        private void setCategoria(){
                if(this.peso < 52.2){
                        this.categoria = "Inválido";
                } else if (this.peso <= 70.3 ) {
                        this.categoria = "Leve";
                } else if(this.peso <= 83.9){
                        this.categoria = "Médio";
                } else if(this.peso <= 120.2){
                        this.categoria = "Pesado";
                } else {
                        this.categoria = "Inválido";
                }
        }
         public int getVitoria(){
                return this.vitoria;
         }
        public void setVitoria(int vi){
                this.vitoria = vi;
        }
        public int getDerrota(){
                return this.derrota;
        }
        public void setDerrota(int de){
                this.derrota = de;
        }
        public int getEmpate(){
                return this.empate;
        }
        public void setEmpate( int em){
                this.empate = em;
        }




}
