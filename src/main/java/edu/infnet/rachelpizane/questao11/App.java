package edu.infnet.rachelpizane.questao11;

import java.util.Scanner;

public class App {   
    public static void main( String[] args ) {
        final int QUANTIDADE_NUMEROS = 6;
        Scanner scanner = new Scanner(System.in);
        int[] numerosApostados = new int[QUANTIDADE_NUMEROS];

        System.out.println("BEM VINDO A LOTERIA!");
        for (int i = 0; i < QUANTIDADE_NUMEROS; i++) {
            System.out.printf("[%sª ESCOLHA] Digite um número não repetido de 1 a 60: ", i + 1);
            int numeroApostado = scanner.nextInt();

            while (numeroApostado < 1 || numeroApostado > 60 || verificarSeJaFoiEscolhido(numeroApostado, numerosApostados)) {
                System.out.printf("[%sª ESCOLHA-ERRO] Número inválido. Digite um número não repetido de 1 a 60: ", i + 1);
                numeroApostado = scanner.nextInt();
            }

            numerosApostados[i] = numeroApostado;
        }

        System.out.println("\nRESULTADO:");
        System.out.println(Loteria.exibirQuantidadeDeAcertos(numerosApostados));

        System.out.println("\n[FIM DO PROGRAMA]");
    }

    private static boolean verificarSeJaFoiEscolhido(int numero, int[] numerosApostados) {
        for (int i = 0; i < numerosApostados.length; i++) {
            if (numerosApostados[i] == numero) {
                return true;
            }
        }

        return false;
    }
}
