package org.example.Modal;

public class Logradouro extends Bairro {

    private int Id;

    private String NomeLogradouro;

    private  int NumeroLogradouro;

    public Logradouro() {
    }

    public Logradouro(int id, String nomeLogradouro, int numeroLogradouro) {
        Id = id;
        NomeLogradouro = nomeLogradouro;
        NumeroLogradouro = numeroLogradouro;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNomeLogradouro() {
        return NomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        NomeLogradouro = nomeLogradouro;
    }

    public int getNumeroLogradouro() {
        return NumeroLogradouro;
    }

    public void setNumeroLogradouro(int numeroLogradouro) {
        NumeroLogradouro = numeroLogradouro;
    }
}
