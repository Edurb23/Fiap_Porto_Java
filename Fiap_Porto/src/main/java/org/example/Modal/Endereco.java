package org.example.Modal;

public class Endereco extends Logradouro {
    private int ID;
    private String Rua;

    private  int NumeroResidencia;

    private  String Complemento;

    public Endereco(int ID, String rua, int numeroResidencia, String complemento) {
        this.ID = ID;
        Rua = rua;
        NumeroResidencia = numeroResidencia;
        Complemento = complemento;
    }

    public Endereco() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public int getNumeroResidencia() {
        return NumeroResidencia;
    }

    public void setNumeroResidencia(int numeroResidencia) {
        NumeroResidencia = numeroResidencia;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "ID=" + ID +
                ", Rua='" + Rua + '\'' +
                ", NumeroResidencia=" + NumeroResidencia +
                ", Complemento='" + Complemento + '\'' +
                '}';
    }
}
