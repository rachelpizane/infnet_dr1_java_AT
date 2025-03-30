package edu.infnet.rachelpizane.questao10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {
    private static File file;

    public static void escreverArquivo(String caminho, String conteudo) {
        file = new File(caminho);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter writer = new FileWriter(file, true);
            writer.write(conteudo + "\n");
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("[ERRO] Arquivo não encontrado");

        } catch (IOException e) {
            System.out.println("[ERRO] não foi possível gravar");

        }
    }

    public static void lerArquivo(String caminho) {
        file = new File(caminho);
        
        try {
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
                String[] dados = myReader.nextLine().split(";");

                String produto = dados[0];
                int quantidade = Integer.parseInt(dados[1]);
                double precoUnitario = Double.parseDouble(dados[2]);

                System.out.printf("Produto: %s, Quantidade: %d, Preço Unitário: R$ %.2f%n", produto, quantidade, precoUnitario);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("[ERRO] Arquivo não encontrado.");
        }
    }
}
