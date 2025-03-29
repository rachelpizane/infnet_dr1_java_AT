package edu.infnet.rachelpizane.questao09;

public class ContaBancaria {
    public String titular;
    public double saldo;

    public ContaBancaria(String titular, double saldo) {
        validarValorPositivo(saldo);

        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        validarValorPositivo(valor);
        saldo += valor;
    }

    public void sacar(double valor) {
        validarValorPositivo(valor);
        validarSaldoSuficiente(valor);

        saldo -= valor;
    }

    public String exibirSaldo(){
        return "Titular: " + titular + ", Saldo: " + String.format("R$ %.2f",saldo);
    }

    void validarValorPositivo(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor deve ser positivo.");
        }
    }

    void validarSaldoSuficiente(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
    }
}
