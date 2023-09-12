package org.example.Modal;

public class Modal extends Veiculos {

    private int Id;

    private String TipoModal;

    private String Combustivel;

    public Modal() {
    }

    public Modal(int id, String tipoModal, String combustivel) {
        Id = id;
        TipoModal = tipoModal;
        Combustivel = combustivel;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTipoModal() {
        return TipoModal;
    }

    public void setTipoModal(String tipoModal) {
        TipoModal = tipoModal;
    }

    public String getCombustivel() {
        return Combustivel;
    }

    public void setCombustivel(String combustivel) {
        Combustivel = combustivel;
    }
}
