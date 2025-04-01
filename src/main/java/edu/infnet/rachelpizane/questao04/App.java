package edu.infnet.rachelpizane.questao04;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String mensagemInput;

        System.out.println("FAÇA EMPRESTIMOS BANCÁRIOS!");
        
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        
        mensagemInput = "Digite o valor do empréstimo: ";
        System.out.print(mensagemInput);
        double valorEmprestimo = scanner.nextDouble();

        while(verificarValor(valorEmprestimo)){
            System.out.println("[ERRO] Valor inválido.");
            System.out.print(mensagemInput);
            valorEmprestimo = scanner.nextDouble();
        }

        mensagemInput = "Digite em quantas parcelas você deseja pagar(min: 6, max: 48): ";
        System.out.print(mensagemInput);
        int parcelas = scanner.nextInt();

        while(parcelas < 6 || parcelas > 48) {
            System.out.println("[ERRO] Número de parcelas inválido.");
            System.out.print(mensagemInput);
            parcelas = scanner.nextInt();
        }

        EmprestimoBancario emprestimo = new EmprestimoBancario(nome, valorEmprestimo, parcelas);

        System.out.println("\nINFORMAÇÕES DO EMPRÉSTIMO:");
        System.out.println(emprestimo.exibirDetalhes());
        
        System.out.println("\n[FIM DO PROGRAMA]");
    }

    private static boolean verificarValor(double valorEmprestimo) {
        if (valorEmprestimo < 0) {
            return true;
        } 
        return false;
    }
}
