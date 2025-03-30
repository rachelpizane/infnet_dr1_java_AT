package edu.infnet.rachelpizane.questao02;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CADASTRO DE USUARIO:");
        System.out.println("OBS: O cadastro de senha deve ter no mínimo \n- 8 caracteres \n- 1 letra maiúscula \n- 1 número \n- 1 caractere especial (@, #, $, etc.)\n");

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        
        boolean solicitarSenha = true;
        while(solicitarSenha) {
            System.out.print("Digite a sua senha: ");
            String senha = scanner.nextLine();
            
            if (ValidadorSenha.validarSenha(senha)) {
                solicitarSenha = false;
                System.out.println("[SUCESSO] Parabens " + nome + "! Seu cadastro foi realizado com sucesso!");
            } 
        }
    }
}
