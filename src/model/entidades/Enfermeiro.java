package model.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "enfermeiro")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Enfermeiro extends Funcionario implements Serializable {

    @Column(name = "enf_coren", length = 45, nullable = false)
    private String coren;

    public Enfermeiro() {

    }

    public Enfermeiro(String coren, double salario, double horaExtra, Integer codigo, String nome, String nascimento, String cpf, String rg, String rua, String numero, String complemento, String bairro, String cep, String email, String sexo, String telefone1, String telefone2, String estado, String cidade) {
        super(salario, horaExtra, codigo, nome, nascimento, cpf, rg, rua, numero, complemento, bairro, cep, email, sexo, telefone1, telefone2, estado, cidade);
        this.coren = coren;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    @Override
    public String toString() {
        return "Enfermeiro{" + "coren=" + coren + '}';
    }

    @Override
    public double calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
