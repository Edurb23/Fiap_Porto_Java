package org.example.Modal;

public class Veiculos {

        private int Id;

        private String Chassi;

        private  String UltilidadeVeiculo;
        private int PesoVeiculo;
        private int TamanhoVeiculo;
        private String PlacaVeiculo;

    public Veiculos() {
    }

    public Veiculos(int id, String chassi, String ultilidadeVeiculo, int pesoVeiculo, int tamanhoVeiculo, String placaVeiculo) {
        Id = id;
        Chassi = chassi;
        UltilidadeVeiculo = ultilidadeVeiculo;
        PesoVeiculo = pesoVeiculo;
        TamanhoVeiculo = tamanhoVeiculo;
        PlacaVeiculo = placaVeiculo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String chassi) {
        Chassi = chassi;
    }

    public String getUltilidadeVeiculo() {
        return UltilidadeVeiculo;
    }

    public void setUltilidadeVeiculo(String ultilidadeVeiculo) {
        UltilidadeVeiculo = ultilidadeVeiculo;
    }

    public int getPesoVeiculo() {
        return PesoVeiculo;
    }

    public void setPesoVeiculo(int pesoVeiculo) {
        PesoVeiculo = pesoVeiculo;
    }

    public int getTamanhoVeiculo() {
        return TamanhoVeiculo;
    }

    public void setTamanhoVeiculo(int tamanhoVeiculo) {
        TamanhoVeiculo = tamanhoVeiculo;
    }

    public String getPlacaVeiculo() {
        return PlacaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        PlacaVeiculo = placaVeiculo;
    }


}
