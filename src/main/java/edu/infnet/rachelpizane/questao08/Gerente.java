package edu.infnet.rachelpizane.questao08;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase * 1.2);
    }

    @Override
    public String exibirDetalhes() {
        return "Gerente=[nome: " + getNome() + ", salário final: " + String.format("R$ %.2f", getSalarioBase()) + "]";
    }
}
