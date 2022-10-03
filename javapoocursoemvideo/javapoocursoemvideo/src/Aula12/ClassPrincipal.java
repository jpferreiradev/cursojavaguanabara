package Aula12;

public class ClassPrincipal {
    public static void main(String args[]){

        //Animal n = new Animal(); -----> Aqui não podemos instanciar um objeto do tipo animal, é uma classe Abstrata

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(85.3);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        p.setPeso(0.35);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        a.setPeso(0.89);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

    }

}