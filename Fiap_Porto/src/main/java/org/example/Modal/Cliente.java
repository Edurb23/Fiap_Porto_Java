package org.example.Modal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class Cliente {
    private int Id;

    private String Nome;

    private String DataNacimento;

    private String CHN;

    private  String CPF;

    private String Rg;

    private String DataCadastro;

    public Cliente() {
    }

    public Cliente(int id, String nome,String dataNacimento, String CHN, String CPF, String rg, String dataCadastro) {
        Id = id;
        Nome = nome;
        DataNacimento = dataNacimento;
        this.CHN = CHN;
        this.CPF = CPF;
        Rg = rg;
        DataCadastro = dataCadastro;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }



    public String getCHN() {
        return CHN;
    }

    public void setCHN(String CHN) {
        this.CHN = CHN;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String rg) {
        Rg = rg;
    }


    public String getDataNacimento() {
        return DataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        DataNacimento = dataNacimento;
    }

    public String getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        DataCadastro = dataCadastro;
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                ", DataNacimento=" + DataNacimento +
                ", CHN='" + CHN + '\'' +
                ", CPF='" + CPF + '\'' +
                ", Rg='" + Rg + '\'' +
                ", DataCadastro=" + DataCadastro +
                '}';
    }
}
