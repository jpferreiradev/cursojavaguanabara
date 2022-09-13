package Aula7;

public class Lutador {


        // Aqui estão os seus atributos
        private String nome;
        private String nacionalidade;
        private int idade;
        private double altura;
        private double peso;
        private String categoria;
        private int vitoria;
        private int derrota;
        private int empate;


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
                setCategoria();
        }

        public String getCategoria(){
                return this.categoria;
        }

        public void setCategoria(){
                if(peso < 52.2){
                        categoria = "Inválido";
                } else if (peso <= 70.3 ) {
                        categoria = "Leve";
                } else if(peso <= 83.9){
                        categoria = "Médio";
                } else if(peso <= 120.2){
                        categoria = "Pesado";
                } else {
                        categoria = "Inválido";
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


        // Aqui estão os seus métodos especiais
        public void apresantar(){
                System.out.println("Lutador: " +  getNome());
                System.out.println("Origem: " + getNacionalidade());
                System.out.println(getIdade() + " anos");
                System.out.println(getAltura() + "m de altura");
                System.out.println("Pesando: " + getPeso() + "Kg");
                System.out.println("Ganhou: " + getVitoria());
                System.out.println("Perdeu:" + getDerrota());
                System.out.println("Empatou: " + getEmpate());
        }
        public void status(){
                System.out.println(getNome());
                System.out.println("é um peso" + getCategoria());
                System.out.println(getVitoria() + "vitórias");
                System.out.println(getDerrota() + "derrotas");
                System.out.println(getEmpate() + "empates");
        }
        public void ganharLuta(){
                setVitoria(getVitoria() + 1);

        }
        public void perderLuta(){
                setVitoria(getDerrota() + 1);
        }

        public void empatarLuta(){
                setEmpate(getEmpate()+ 1);
        }




}
