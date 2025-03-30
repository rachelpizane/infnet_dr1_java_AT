package edu.infnet.rachelpizane.questao02;

public class ValidadorSenha {
    private static String senha;

    public static boolean validarSenha(String senha) {
        ValidadorSenha.senha = senha;

        if (!validarTamanho()) {
            return false;
        }
        
        if (!validarLetraMaiuscula()) {
            return false;
        }

        if (!validarNumero()) {
            return false;
        }

        if (!validarCaractereEspecial()) {
            return false;
        }

        System.out.println("[SUCESSO] Senha válida!");

        return true;
    }

    private static boolean validarTamanho() {
        if (senha.length() < 8) {
            System.out.println("[ERRO] A senha deve ter no mínimo 8 caracteres.");
            return false;
        }
        return true;
    }
    
    private static boolean validarLetraMaiuscula() {
        if (!senha.matches(".*[A-Z].*")) {
            System.out.println("[ERRO] A senha deve conter pelo menos uma letra maiúscula.");
            return false;
        }
        return true;
    }
    
    private static boolean validarNumero() {
        if (!senha.matches(".*\\d.*")) {
            System.out.println("[ERRO] A senha deve conter pelo menos um número.");
            return false;
        }
        return true;
    }
    
    private static boolean validarCaractereEspecial() {
        if (!senha.matches(".*[!@#$%^&*()_+{}\\[\\]:;<>,.?/~\\\\|-].*")) {
            System.out.println("[ERRO] A senha deve conter pelo menos um caractere especial (@, #, $, etc.).");
            return false;
        }
        return true;
    }
}
