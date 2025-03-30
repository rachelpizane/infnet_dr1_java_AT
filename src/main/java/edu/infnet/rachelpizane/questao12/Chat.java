package edu.infnet.rachelpizane.questao12;

import java.util.Scanner;

public class Chat {
    private final int MAX_MENSAGENS = 10;
    
    private Scanner scanner = new Scanner(System.in);
    private String[] usuarios;
    private Mensagem[] historico = new Mensagem[MAX_MENSAGENS];
    
    public Chat(String[] usuarios) {
        this.usuarios = usuarios;
    }

    public void iniciarChat() {
        System.out.println("\n=== CHAT INICIADO ===\n");

        for (int i = 0; i < historico.length; i++) {
                String usuarioAtual = usuarios[i % usuarios.length];
                boolean mensagemEnviada = false;

                while(!mensagemEnviada) {
                    System.out.printf("%s, digite sua mensagem: ", usuarioAtual );

                    String mensagem = scanner.nextLine();

                    if(!validarMensagemNaoVazia(mensagem)) {
                        continue;
                    }

                    historico[i] = new Mensagem(usuarioAtual, mensagem);
                    mensagemEnviada = true;
                }
            }

        System.out.println("=== CHAT FINALIZADO ===\n\n");
    }

    public void exibirHistorico() {
        System.out.println("=== HISTÓRICO DE MENSAGENS ===");
        for (Mensagem mensagem : historico) {
                System.out.printf("%s: %s%n", mensagem.getUsuario(), mensagem.getMensagem());
        }
    }

    public void exibirDespedida() {
        System.out.println("\n\n[FIM DO PROGRAMA] Obrigado por utilizarem o sistema! Boa sorte para vocês! ");
    }

    private boolean validarMensagemNaoVazia(String mensagem) {
        if (mensagem.trim().isEmpty()) {
            System.out.println("[ERRO] Mensagem não pode estar vazia. Tente novamente.");
            return false;
        }

        return true;
    }
}
