package Aula10;

public class ProjetoPessoas {
    public static void main(String args[]){

        // Tipo abstrato

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("JP");
        p2.setNome("Thay");
        p3.setNome("João");
        p4.setNome("Ricarte");

        p2.setCurso("Informática");
        p3.setSalario(2500.75);
        p4.setSetor("Estoque");

        p1.setSexo("M");
        p2.setSexo("F");
        p2.setIdade(18);



        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


        //p3.receberAum(440.67);

    }

}
