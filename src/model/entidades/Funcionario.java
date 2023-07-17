package model.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Funcionario extends Pessoa implements Serializable {

    @Column(name = "fun_salario", nullable = false)
    private double salario;

    @Column(name = "fun_horaExtra", nullable = false)
    private double horaExtra;

    public Funcionario() {
    }

    public Funcionario(double salario, double horaExtra, Integer codigo, String nome, String nascimento, String cpf, String rg, String rua, String numero, String complemento, String bairro, String cep, String email, String sexo, String telefone1, String telefone2, String estado, String cidade) {
        super(codigo, nome, nascimento, cpf, rg, rua, numero, complemento, bairro, cep, email, sexo, telefone1, telefone2, estado, cidade);
        this.salario = salario;
        this.horaExtra = horaExtra;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(double horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "salario=" + salario + ", horaExtra=" + horaExtra + '}';
    }

    public abstract double calcularSalario();
    
}