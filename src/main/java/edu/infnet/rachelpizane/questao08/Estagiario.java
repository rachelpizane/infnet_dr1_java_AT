package edu.infnet.rachelpizane.questao08;

public class Estagiario extends Funcionario{


    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase * 0.9);
    }

    @Override
    public String exibirDetalhes() {
        return "Estagiario=[nome: " + getNome() + ", salário final: " + String.format("R$ %.2f", getSalarioBase()) + "]";
    }
}
