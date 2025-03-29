package edu.infnet.rachelpizane.questao04;

public class EmprestimoBancario {
    private final double TAXA_JUROS = 0.03;
    private String nome;
    private double valorEmprestimo;	
    private int quantidadeParcelas;

    public EmprestimoBancario(String nome, double valorEmprestimo, int quantidadeParcelas) {
        this.nome = nome;
        this.valorEmprestimo = valorEmprestimo;
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public double calcularValorTotalPago() {
        return valorEmprestimo + (valorEmprestimo * TAXA_JUROS * quantidadeParcelas);
    } 

    public double calcularValorParcela() {
        return calcularValorTotalPago() / quantidadeParcelas;
    }

    public String exibirDetalhes(){
        return String.format("Nome: %s %nValor do Empréstimo: %.2f %nQuantidade de Parcelas: %d %nValor Total Pago: %.2f %nValor da Parcela: %.2f", nome, valorEmprestimo, quantidadeParcelas, calcularValorTotalPago(), calcularValorParcela());
    }
}
