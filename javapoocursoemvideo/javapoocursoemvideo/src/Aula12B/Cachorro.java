package Aula12B;

public class Cachorro  extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
        //super.emitirSom();
    }


    // Aqui foi implementado o polimofirsmo de SOBRECARGA!

    // Reação por frase
    public void reagir(String frase) {
        if(frase.equals("Toma comida") || frase.equals("Olá")){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }

    }
    // Reação por hora
    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e Latir");
        }
    }
    // Reação por dono
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
            //this.emitirSom();
        }
    }
    // Reação por idade e peso
    public void reagir(int idade, double peso) {

        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if(peso < 10){
            System.out.println("Rosnar");
            } else {
            System.out.println("Ignorar");
        }

        }
    }

}

/*
/*
        if(frase = "Toma comida".equals(frase = "Olá")){
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");

       }
 */