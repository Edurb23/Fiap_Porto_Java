package org.example.Modal;

public class Bairro extends Cidade {

    private int Id;

    private String NomeBairro;

    private String NomeZonaBaiiro;

    public Bairro() {
    }

    public Bairro(int id, String nomeBairro, String nomeZonaBaiiro) {
        Id = id;
        NomeBairro = nomeBairro;
        NomeZonaBaiiro = nomeZonaBaiiro;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNomeBairro() {
        return NomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        NomeBairro = nomeBairro;
    }

    public String getNomeZonaBaiiro() {
        return NomeZonaBaiiro;
    }

    public void setNomeZonaBaiiro(String nomeZonaBaiiro) {
        NomeZonaBaiiro = nomeZonaBaiiro;
    }
}
