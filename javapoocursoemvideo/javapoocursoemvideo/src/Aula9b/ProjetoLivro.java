package Aula9b;

public class ProjetoLivro {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("JP",30,"M");
        p[1] = new Pessoa("Thaynara", 30,"F");

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300,p[0]);
        l[1] = new Livro("POO para iniciantes","Maria Silva", 500,p[0]);
        l[2] = new Livro("Java avançado", "Maria Jose",800,p[0]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avançarPag();
        System.out.println(l[0].detalhes());


        System.out.println(l[1].detalhes());

    }
}
