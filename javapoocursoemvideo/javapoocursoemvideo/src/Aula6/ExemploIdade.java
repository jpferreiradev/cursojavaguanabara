
package Aula6;

import java.util.Scanner;
public class ExemploIdade {
    public static void main(String args[]){

        int anoAtual;
        int anoPassado;
        int idadeAtual;
        //int conversaoAnoAtualParaIdade;

        Scanner idade = new Scanner(System.in);


        System.out.println("Digite o ano atual:");
        anoAtual = idade.nextInt();
        System.out.println("O ano atual é: " + anoAtual);
        System.out.println("Digite o que você quer diminuir:");
        anoPassado = idade.nextInt();
        System.out.println("O ano passado digitado foi: " + anoPassado);
        int conversaoAnoAtualParaIdade = anoAtual - anoPassado;
            System.out.println("Sua idade atual é:" + conversaoAnoAtualParaIdade + " anos");

    }
}
