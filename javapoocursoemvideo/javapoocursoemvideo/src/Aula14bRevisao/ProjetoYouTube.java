package Aula14bRevisao;

public class ProjetoYouTube {
    public static void main(String args[]){

        Video v[] = new Video[3]; // Exemplo de criação de um vetor no Java
       v[0] = new Video("Aula 1 de POO");
       v[1] = new Video("Aula 2 de PHP");
       v[2] = new Video("Aula 10 de HTML 5");

       Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("JP",30,"M","jotepauder");
        g[1] = new Gafanhoto("Thaynara",30,"F","thayinha");

        //Pessoa teste = new Pessoa("JP",30,"M");
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());

    }
}


// Lembre-se de como criar vetores no Java;