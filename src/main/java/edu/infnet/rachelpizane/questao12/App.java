package edu.infnet.rachelpizane.questao12;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String[] usuarios = new String[2];

        System.out.println("=== BEM VINDO AO CHAT ===\n");
        for (int i = 0; i < usuarios.length; i++) {

            boolean usuarioCorreto = false;

                while(!usuarioCorreto) {
                    System.out.printf("Digite o nome do %dº usuário: ", i + 1);
                    String usuario = scanner.nextLine();

                    usuario = capitalizarPrimeiraLetra(usuario);
                    usuarioCorreto = validarNomeUsuarioNaoVazio(usuario);

                    if(!usuarioCorreto) {
                        continue;
                    }

                    usuarios[i] = usuario;
             }
        }

        Chat chat = new Chat(usuarios);

        chat.iniciarChat();
        chat.exibirHistorico();
        chat.exibirDespedida();
    }

    private static boolean validarNomeUsuarioNaoVazio(String mensagem) {
        if (mensagem.trim().isEmpty()) {
            System.out.println("[ERRO] Nome do usuário não pode estar vaziao. Tente novamente.");
            return false;
        }

        return true;
    }

    private static String capitalizarPrimeiraLetra(String texto) {
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }
}
