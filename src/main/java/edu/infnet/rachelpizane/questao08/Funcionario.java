package edu.infnet.rachelpizane.questao08;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String exibirDetalhes(){
        return "Funcionario=[nome: " + nome + ", salário final: " + String.format("R$ %.2f", salarioBase) + "]";
    }
}
