package Aula14bRevisao;

public class ProjetoYouTube {
    public static void main(String args[]){

        Video v[] = new Video[3]; // Exemplo de criação de um vetor no Java
       v[0] = new Video("Aula 1 de POO");
       v[1] = new Video("Aula 2 de PHP");
       v[2] = new Video("Aula 10 de HTML 5");

        System.out.println(v[0].toString());

        Pessoa teste = new Pessoa("JP",30,"M");

    }
}


// Lembre-se de como criar vetores no Java;