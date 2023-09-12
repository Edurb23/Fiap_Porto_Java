package org.example.Modal;

public class Telefone {
    private int ID;

    private int NumeroTelefone;
    private int DDD;
    private int DDI;
    private String Operadora;

    public Telefone() {
    }

    public Telefone(int ID, int numeroTelefone, int DDD, int DDI, String operadora) {
        this.ID = ID;
        NumeroTelefone = numeroTelefone;
        this.DDD = DDD;
        this.DDI = DDI;
        Operadora = operadora;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumeroTelefone() {
        return NumeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        NumeroTelefone = numeroTelefone;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public int getDDI() {
        return DDI;
    }

    public void setDDI(int DDI) {
        this.DDI = DDI;
    }

    public String getOperadora() {
        return Operadora;
    }

    public void setOperadora(String operadora) {
        Operadora = operadora;
    }


}
