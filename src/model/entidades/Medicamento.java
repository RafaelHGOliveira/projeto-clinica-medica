package model.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "medicamento")
public class Medicamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medi_codigo", nullable = false)
    private Integer codigo;

    @Column(name = "medi_nome", length = 45, nullable = false)
    private String nome;

    @Column(name = "medi_substancia", length = 200, nullable = false)
    private String substancia;

    @Column(name = "medi_posologia", length = 50, nullable = true)
    private String posologia;

    @Column(name = "medi_laboratorio", length = 50, nullable = false)
    private String laboratorio;

    @Column(name = "medi_generico", length = 50, nullable = true)
    private String generico;
    
    @OneToMany(mappedBy = "Medicamento")
    private Collection<Consulta> consultas;

    public Medicamento() {
    }

    public Medicamento(Integer codigo, String nome, String substancia, String posologia, String laboratorio, String generico, Collection<Consulta> consultas) {
        this.codigo = codigo;
        this.nome = nome;
        this.substancia = substancia;
        this.posologia = posologia;
        this.laboratorio = laboratorio;
        this.generico = generico;
        this.consultas = consultas;
    }

    public Collection<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(Collection<Consulta> consultas) {
        this.consultas = consultas;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSubstancia() {
        return substancia;
    }

    public void setSubstancia(String substancia) {
        this.substancia = substancia;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getGenerico() {
        return generico;
    }

    public void setGenerico(String generico) {
        this.generico = generico;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "codigo=" + codigo + ", nome=" + nome + ", substancia=" + substancia + ", posologia=" + posologia + ", laboratorio=" + laboratorio + ", generico=" + generico + ", consultas=" + consultas + '}';
    }
  
}
