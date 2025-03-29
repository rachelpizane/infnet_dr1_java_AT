package edu.infnet.rachelpizane.questao03;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA DE IMPOSTOS:");
        
        System.out.print("Informe o seu nome: ");
        String nome = scanner.nextLine();
        
        String mensagemInput = "Informe o seu salário bruto anual: ";
        System.out.print(mensagemInput);
        double salarioBrutoAnual = scanner.nextDouble();

        while(verificarValor(salarioBrutoAnual)){
            System.out.println("[ERRO] Valor inválido.");
            System.out.println(mensagemInput);
            salarioBrutoAnual = scanner.nextDouble();
        }

        CalculadoraImposto calculadoraImposto = new CalculadoraImposto(nome, salarioBrutoAnual);

        System.out.println("\nINFORMAÇÕES DO IMPOSTO:");
        System.out.println(calculadoraImposto.exibirDetalhes());
        
        System.out.println("\n[FIM DO PROGRAMA]");
    }

    private static boolean verificarValor(double salarioBrutoAnual) {
        if (salarioBrutoAnual < 0) {
            return true;
        } 
        return false;
    }
}
