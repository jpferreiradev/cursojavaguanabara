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

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[2]); // JP assiste HTML
        vis[0].avaliar(); // Exemplo de avaliar sem parâmetro
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0],v[1]); // JP assiste aula 2 de PHP
        vis[0].avaliar(87.0); // Exemplo de avalair com parametro double
        System.out.println(vis[1].toString());






    }

}


// Lembre-se de como criar vetores no Java;

 /*
        System.out.println("VÍDEOS\n--------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n---------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        */

//Pessoa teste = new Pessoa("JP",30,"M");