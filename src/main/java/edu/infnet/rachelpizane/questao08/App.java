package edu.infnet.rachelpizane.questao08;

public class App 
{
    public static void main( String[] args )
    {
        Gerente gerente = new Gerente("Katarina", 5000.00);
        
        Estagiario estagiario = new Estagiario("Manuela", 2000.00);

        System.out.println("INFORMAÇÕES DOS FUNCIONARIOS:");

        System.out.println(gerente.exibirDetalhes());
        System.out.println(estagiario.exibirDetalhes());

        System.out.println("\n[FIM DO PROGRAMA]");
    }
}
