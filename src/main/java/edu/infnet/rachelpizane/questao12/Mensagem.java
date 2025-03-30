package edu.infnet.rachelpizane.questao12;

public class Mensagem {
    private String usuario;
    private String mensagem;

    public Mensagem(String usuario, String mensagem) {
        this.usuario = usuario;
        this.mensagem = mensagem;
    }

    public String getUsuario() {
        return capitalizarPrimeiraLetra(usuario);
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMensagem() {
        return capitalizarPrimeiraLetra(mensagem);
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    private String capitalizarPrimeiraLetra(String texto) {
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }
}
