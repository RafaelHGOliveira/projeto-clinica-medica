package model.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "crianca")
public class Crianca extends Paciente implements Serializable, Pagamento {

    @Column(name = "cri_nomeResponsavel", length = 45, nullable = false)
    private String nomeResponsavel;

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public Crianca() {
    }

    public Crianca(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public Crianca(String nomeResponsavel, Collection<Consulta> consultas, Integer codigo, String nome, String nascimento, String cpf, String rg, String rua, String numero, String complemento, String bairro, String cep, String email, String sexo, String telefone1, String telefone2, String estado, String cidade) {
        super(consultas, codigo, nome, nascimento, cpf, rg, rua, numero, complemento, bairro, cep, email, sexo, telefone1, telefone2, estado, cidade);
        this.nomeResponsavel = nomeResponsavel;
    }
    
    @Override
    public String toString() {
        return "Crianca{" + "nomeResponsavel=" + nomeResponsavel + '}';
    }

}
