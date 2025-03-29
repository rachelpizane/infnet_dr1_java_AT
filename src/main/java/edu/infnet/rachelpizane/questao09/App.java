package edu.infnet.rachelpizane.questao09;

public class App 
{
    public static void main( String[] args )
    {
        ContaBancaria conta1 = new ContaBancaria("Beatriz Garcia", 1000.00);
  
        System.out.println("INFORMAÇÕES BANCÁRIAS:");

        System.out.println(conta1.exibirSaldo());
        conta1.depositar(200.00);
      
        System.out.println("\nSALDO APÓS DEPOSITAR:");
        System.out.println(conta1.exibirSaldo());

        conta1.sacar(150.00);

        System.out.println("\nSALDO APÓS SACAR:");
        System.out.println(conta1.exibirSaldo());

        System.out.println("\n[FIM DO PROGRAMA]");
    }
}
