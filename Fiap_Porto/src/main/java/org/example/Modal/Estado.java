package org.example.Modal;

public class Estado {

    private int Id;

    private String NomeEstado;

    private String SiglaEstado;


    public Estado() {
    }

    public Estado(int id, String nomeEstado, String siglaEstado) {
        Id = id;
        NomeEstado = nomeEstado;
        SiglaEstado = siglaEstado;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNomeEstado() {
        return NomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        NomeEstado = nomeEstado;
    }

    public String getSiglaEstado() {
        return SiglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        SiglaEstado = siglaEstado;
    }
}
