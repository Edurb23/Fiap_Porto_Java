package org.example.Modal;

public class LocalizacaoVeiculo {

    private  int id ;
    private  int NumeroRuaVeiculo;

    private String NomeRuaVeiculo;
    private int NumeroCepVeiculo;
    private String NomeBairoVeiculo;

    private String PontoRefencia;

    public LocalizacaoVeiculo() {
    }

    public LocalizacaoVeiculo(int id, int numeroRuaVeiculo, String nomeRuaVeiculo, int numeroCepVeiculo, String nomeBairoVeiculo, String pontoRefencia) {
        this.id = id;
        NumeroRuaVeiculo = numeroRuaVeiculo;
        NomeRuaVeiculo = nomeRuaVeiculo;
        NumeroCepVeiculo = numeroCepVeiculo;
        NomeBairoVeiculo = nomeBairoVeiculo;
        PontoRefencia = pontoRefencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroRuaVeiculo() {
        return NumeroRuaVeiculo;
    }

    public void setNumeroRuaVeiculo(int numeroRuaVeiculo) {
        NumeroRuaVeiculo = numeroRuaVeiculo;
    }

    public String getNomeRuaVeiculo() {
        return NomeRuaVeiculo;
    }

    public void setNomeRuaVeiculo(String nomeRuaVeiculo) {
        NomeRuaVeiculo = nomeRuaVeiculo;
    }

    public int getNumeroCepVeiculo() {
        return NumeroCepVeiculo;
    }

    public void setNumeroCepVeiculo(int numeroCepVeiculo) {
        NumeroCepVeiculo = numeroCepVeiculo;
    }

    public String getNomeBairoVeiculo() {
        return NomeBairoVeiculo;
    }

    public void setNomeBairoVeiculo(String nomeBairoVeiculo) {
        NomeBairoVeiculo = nomeBairoVeiculo;
    }

    public String getPontoRefencia() {
        return PontoRefencia;
    }

    public void setPontoRefencia(String pontoRefencia) {
        PontoRefencia = pontoRefencia;
    }
}
