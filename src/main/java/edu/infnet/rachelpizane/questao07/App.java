package edu.infnet.rachelpizane.questao07;

public class App 
{
    public static void main( String[] args )
    {
        Aluno aluno1 = new Aluno("Carol", "54321", 8.5, 7.0, 9.0);
        Aluno aluno2 = new Aluno("Jorge", "12345", 6.0, 5.5, 7.5);
        
        System.out.println("INFORMAÇÕES DOS ALUNOS:");

        System.out.println(aluno1.exibirDetalhes());
        System.out.println(aluno2.exibirDetalhes());

        System.out.println("\n[FIM DO PROGRAMA]");
    }
}
