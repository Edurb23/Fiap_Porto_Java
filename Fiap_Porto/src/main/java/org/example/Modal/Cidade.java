package org.example.Modal;

public class Cidade extends Estado {
    private int id;

    private String NomeCidade ;

    private int CodigoIbg;

    private int DDD;

    public Cidade() {
    }

    public Cidade(int id, String nomeCidade, int codigoIbg, int DDD) {
        this.id = id;
        NomeCidade = nomeCidade;
        CodigoIbg = codigoIbg;
        this.DDD = DDD;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCidade() {
        return NomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        NomeCidade = nomeCidade;
    }

    public int getCodigoIbg() {
        return CodigoIbg;
    }

    public void setCodigoIbg(int codigoIbg) {
        CodigoIbg = codigoIbg;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }
}
