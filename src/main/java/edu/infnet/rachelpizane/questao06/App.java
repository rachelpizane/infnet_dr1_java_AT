package edu.infnet.rachelpizane.questao06;

public class App 
{
    public static void main( String[] args )
    {
        Veiculo veiculo1 = new Veiculo("YUN347", "Gol", 2001, 10000.00);
        Veiculo veiculo2 = new Veiculo("JKW124", "Uno", 2006, 18500.00);

        System.out.println("INFORMAÇÕES DOS VEICULOS:");

        System.out.println(veiculo1.exibirDetalhes());
        System.out.println(veiculo2.exibirDetalhes());

        veiculo1.registrarViagem(2340.00);
        veiculo2.registrarViagem(3170.00);

        System.out.println(veiculo1.exibirDetalhes());
        System.out.println(veiculo2.exibirDetalhes());

        System.out.println("\n[FIM DO PROGRAMA]");
    }
}
