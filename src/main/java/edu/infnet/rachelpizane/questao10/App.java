package edu.infnet.rachelpizane.questao10;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int QUANTIDADE_COMPRAS = 3;
        final String CAMINHO_COMPRAS = "src\\main\\resources\\compras.txt";
        final String REGEX = "^[a-zA-ZÀ-ÿ\\s]+;\\d+;\\d+([.,]\\d{2})?$";

        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEMA DE CONTROLE DE COMPRAS ===\n");
        System.out.println("Registre abaixo as três compras realizadas.");
        System.out.println("[OBS] Formato para o registro: produto;quantidade;preço unitário (exs: arroz;2;3,50 / feijao;1;4.99 / leite;3;3)\n");

         for (int i = 0; i < QUANTIDADE_COMPRAS; i++) {

            String compra = "";
            while(!compra.matches(REGEX)) {
                System.out.printf("Digite a %dª compra: ", i + 1);
                compra = input.nextLine();

                if (!compra.matches(REGEX)) {
                    System.out.println("[ERRO] Formato inválido. Tente novamente.");
                } 
            }
            compra = formatarPreco(compra);
            Arquivo.escreverArquivo(CAMINHO_COMPRAS, compra);
        }

        System.out.println("\n=== HISTÓRICO DE COMPRAS ===");
        Arquivo.lerArquivo(CAMINHO_COMPRAS);

        System.out.println("\n\n[FIM DO PROGRAMA]");
    }

    public static String formatarPreco(String entrada) {
        final String REGEX_PRECO = "^\\d+,\\d{2}$";

        String[] dados = entrada.split(";");
        String precoUnitario = dados[2];
        
        if(precoUnitario.matches(REGEX_PRECO)) {
            dados[2] = precoUnitario.replace(",", ".");
        };
        
        return String.join(";", dados);
    }
}
