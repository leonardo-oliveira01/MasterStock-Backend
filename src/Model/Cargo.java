package Model;

public class Cargo {
    String nomeCargo;
    String descricao;
    int salario;

    public Cargo(String nomeCargo, String descricao, int salario) {
        this.nomeCargo = nomeCargo;
        this.descricao = descricao;
        this.salario = salario;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
