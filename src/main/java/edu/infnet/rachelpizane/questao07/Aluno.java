package edu.infnet.rachelpizane.questao07;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        validarNota(nota1);
        validarNota(nota2);
        validarNota(nota3);

        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public String verificarAprovacao() {
        double media = calcularMedia();

        if (media >= 7.0) {
            return "Aprovado";
        }

        return "Reprovado";
    }

    public String exibirDetalhes() {
        return "Aluno=[nome: " + nome + ", matricula: " + matricula + ", 1ª nota: " + String.format("%.2f", nota1) +
                ", 2ª nota: " + String.format("%.2f", nota2) + ", 3ª nota: " + String.format("%.2f", nota3) +
                ", media: " + String.format("%.2f", calcularMedia()) + ", status: " + verificarAprovacao() + "]";
    }

    private void validarNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
    }
}
