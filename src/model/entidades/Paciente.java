package model.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente extends Pessoa implements Serializable, Pagamento {
        
    @OneToMany(mappedBy = "Paciente")
    private Collection<Consulta> consultas;

    public Paciente() {
    }

    public Paciente(Collection<Consulta> consultas) {
        this.consultas = consultas;
    }

    public Paciente(Collection<Consulta> consultas, Integer codigo, String nome, String nascimento, String cpf, String rg, String rua, String numero, String complemento, String bairro, String cep, String email, String sexo, String telefone1, String telefone2, String estado, String cidade) {
        super(codigo, nome, nascimento, cpf, rg, rua, numero, complemento, bairro, cep, email, sexo, telefone1, telefone2, estado, cidade);
        this.consultas = consultas;
    }

    public Collection<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(Collection<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Paciente{" + "consultas=" + consultas + '}';
    }

    /**
     *
     * @return
     */
    @Override
    public double calcularPagamento() {
        return 0;
    }

}
