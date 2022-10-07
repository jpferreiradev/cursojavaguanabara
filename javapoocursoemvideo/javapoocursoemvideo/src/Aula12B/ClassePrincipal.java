package Aula12B;

public class ClassePrincipal {
    public static void main(String args[]){

        Cachorro c = new Cachorro();

        //c.reagir("Vai apanhar");
        c.reagir(2,12.5);
        c.reagir(17,4.5);
        /*
        c.reagir("Vai apanhar");
        c.reagir(11,45);
        c.reagir(21,00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5);
        c.reagir(17, 4.5);
        */
    }
}


/*

    Cachorro c = new Cachorro();

    c.reagir("Olá") // Abanair e latir
    c.reagir("Vai apanhar") // Rosnar
    c.reagir(11,45) // Abanar
    c.reagir(21,00) / Ignorar
    c.reagir(true)/ Abanar
    c.reagir(false) /Rosnar e latir
    c.reagir(2, 12.5) // Latir
    c.reagir(17, 4.5) // Rosnar
 */