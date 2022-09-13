package Aula1;

public class ExemploVetor {
    public static void main(String[] args){
        // Criação de array

        // Aqui é uma boa prática Java
        double[] temperaturas = new double[365]; // Maneira de criar um array
        temperaturas[0] = 31.3; // Maneira de inicializar um array
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;
        temperaturas[5] = 33.1;
        temperaturas[6] = 32.8;
        temperaturas[7] = 30;
        temperaturas[8] = 29.8;
        temperaturas[9] = 31.5;

        System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);

        // Como saber qual é o tamanho do array
        System.out.println("O tamanho do array: " + temperaturas.length);

        // Como podemos imprimir o valores do array
        System.out.println("Valores do array" + temperaturas);

        // Como imprimir todos os valores do array, o mais comum é o for / Aqui obtemos o indice, qual que é o contador, o número de vezes que está passando por esse for
        // podemos ter essa informação com o "i"
        for(int i =0;i < temperaturas.length; i++){
            System.out.println(" O valor da temperatura do dia " + (i+1) +  " é: " + temperaturas[i]);
        }

        // Existe um for melhorado, introduzido na versão 5 do Java/ Aqui só obtemos o valor total do array
        for(double temp : temperaturas){
            System.out.println(temp);
        }

    }
}

/*
   Aqui não é uma boa prática
   double temp[];
 */

/*
        double temDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;
        double tempDia006 = 32.8;
        double tempDia007 = 30;
        double tempDia008 = 29.8;
        double tempDia009 = 31.5;
        */