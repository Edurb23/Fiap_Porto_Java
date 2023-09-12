package org.example.Modal;

public class Email {
    private int Id;

    private String email;

    private String TipoEmail;

    private String StatusEmail;

    public Email() {
    }

    public Email(int id, String email, String tipoEmail, String statusEmail) {
        Id = id;
        this.email = email;
        TipoEmail = tipoEmail;
        StatusEmail = statusEmail;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoEmail() {
        return TipoEmail;
    }

    public void setTipoEmail(String tipoEmail) {
        TipoEmail = tipoEmail;
    }

    public String getStatusEmail() {
        return StatusEmail;
    }

    public void setStatusEmail(String statusEmail) {
        StatusEmail = statusEmail;
    }
}
