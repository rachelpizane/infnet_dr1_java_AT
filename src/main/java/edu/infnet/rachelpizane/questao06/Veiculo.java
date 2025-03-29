package edu.infnet.rachelpizane.questao06;

public class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        validarQuilometragem(quilometragem);

        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public String exibirDetalhes() {
        return "Veiculo=[placa: " + placa + ", modelo: " + modelo + ", ano de Fabricação: " + anoFabricacao + ", quilometragem: " + String.format("%.2f km", quilometragem) + "]";
    }

    public void registrarViagem(double quilometros) {
        validarQuilometragem(quilometros);
        this.quilometragem += quilometros;
    }

    public void validarQuilometragem(double quilometros) {
        if (quilometros < 0) {
            throw new IllegalArgumentException("A quilometragem não pode ser negativa.");
        }
    }
}
