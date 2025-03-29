package edu.infnet.rachelpizane.questao11;

import java.util.Arrays;
import java.util.Random;

public class Loteria {
    private static Random random = new Random();
    private static final int QUANTIDADE_NUMEROS = 6;
    private static final int MAX_NUMERO = 60;
    private static final int MIN_NUMERO = 1;
    private static int[] numerosSorteados = new int[QUANTIDADE_NUMEROS];

    public static String exibirQuantidadeDeAcertos(int[] numerosApostados){
        sortearValores();

        int acertos = compararValores(numerosApostados);

        String resultado = String.format("Números sorteados: %s %nNúmeros apostados: %s %nQuantidade de acertos: %d", Arrays.toString(numerosSorteados), Arrays.toString(numerosApostados), acertos);

        return resultado;
    }

    private static int compararValores(int[] numerosApostados){
        int acertos = 0;
        for (int i = 0; i < QUANTIDADE_NUMEROS; i++) {
            for (int j = 0; j < QUANTIDADE_NUMEROS; j++) {
                if (numerosApostados[i] == numerosSorteados[j]) {
                    acertos++;
                }
            }
        }
        return acertos;
    }

    private static void sortearValores() {
        for (int i = 0; i < QUANTIDADE_NUMEROS; i++) {
            int numeroSorteado = random.nextInt(MIN_NUMERO, MAX_NUMERO + 1);

            while (verificarSeJaFoiSorteado(numeroSorteado)) {
                numeroSorteado = random.nextInt(MIN_NUMERO, MAX_NUMERO + 1);
            }

            numerosSorteados[i] = numeroSorteado;
        }
    }

    private static boolean verificarSeJaFoiSorteado(int numero) {
        for (int i = 0; i < QUANTIDADE_NUMEROS; i++) {
            if (numerosSorteados[i] == numero) {
                return true;
            }
        }
        return false;
    }
}
