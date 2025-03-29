package edu.infnet.rachelpizane.questao03;

public class CalculadoraImposto {
    private final double TAXA_7_5 = 0.075;
    private final double TAXA_15 = 0.15;
    private final double TAXA_27_5 = 0.275;

    private final double VALOR_MAX_ISENTO = 22847.76;
    private final double VALOR_MAX_7_5 = 33919.80;
    private final double VALOR_MAX_15 = 45012.60;

    private String nome;
    private double salarioBruto;

    public CalculadoraImposto(String nome, double salarioBruto) {
        verificarValorPositivo(salarioBruto);

        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public double calcularSalarioLiquido() {
        return salarioBruto - calcularValorImposto();
    }

    public double calcularValorImposto() {
        if (salarioBruto <= VALOR_MAX_ISENTO) {
            return 0;

        } else if (salarioBruto <= VALOR_MAX_7_5) {
            return salarioBruto * TAXA_7_5;

        } else if (salarioBruto <= VALOR_MAX_15) {
            return salarioBruto * TAXA_15;

        } else {
            return salarioBruto * TAXA_27_5;
        }
    }

    public String exibirDetalhes() {
        return String.format("Nome: %s %nSalário Bruto: R$ %.2f %nValor do Imposto: R$ %.2f %nSalário Líquido: R$ %.2f", nome, salarioBruto, calcularValorImposto(), calcularSalarioLiquido());
    }

    private void verificarValorPositivo(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor deve ser positivo.");
        }
    }
}
