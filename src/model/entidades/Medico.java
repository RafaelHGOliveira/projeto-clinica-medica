package model.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico extends Funcionario implements Serializable, Pagamento {

    @Column(name = "med_CRM", nullable = false)
    private int crm;

    @Column(name = "med_especialidade", length = 45, nullable = false)
    private String especialidade;

    @Column(name = "med_area", length = 45, nullable = false)
    private String area;
    
    @OneToMany(mappedBy = "medico")
    private Collection<Consulta> consultas;

    public Medico() {

    }

    public Medico(int crm, String especialidade, String area, Collection<Consulta> consultas) {
        this.crm = crm;
        this.especialidade = especialidade;
        this.area = area;
        this.consultas = consultas;
    }

    public Medico(int crm, String especialidade, String area, Collection<Consulta> consultas, double salario, double horaExtra, Integer codigo, String nome, String nascimento, String cpf, String rg, String rua, String numero, String complemento, String bairro, String cep, String email, String sexo, String telefone1, String telefone2, String estado, String cidade) {
        super(salario, horaExtra, codigo, nome, nascimento, cpf, rg, rua, numero, complemento, bairro, cep, email, sexo, telefone1, telefone2, estado, cidade);
        this.crm = crm;
        this.especialidade = especialidade;
        this.area = area;
        this.consultas = consultas;
    }

    public Collection<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(Collection<Consulta> consultas) {
        this.consultas = consultas;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Medico{" + "crm=" + crm + ", especialidade=" + especialidade + ", area=" + area + ", consultas=" + consultas + '}';
    }

    @Override
    public double calcularPagamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
