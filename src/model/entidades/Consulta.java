package model.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consulta")
public class Consulta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "con_codigo", nullable = false)
    private Integer codigo;

    @Column(name = "con_tipo", length = 45, nullable = false)
    private String tipo;

    @Column(name = "con_data", length = 20, nullable = false)
    private String data;

    @Column(name = "con_horario", length = 45, nullable = false)
    private String horario;

    @Column(name = "pac_exame", length = 50)
    private String exame;

    @Column(name = "pac_exameData", length = 50)
    private String exameData;

    @Column(name = "pac_exameResult", length = 50)
    private String exameResult;

    @ManyToOne
    @JoinColumn(referencedColumnName = "pes_codigo", name = "paciente_con_codigo")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(referencedColumnName = "pes_codigo", name = "medico_con_codigo")
    private Medico medico;
    
    @ManyToOne
    @JoinColumn(referencedColumnName = "con_codigo", name = "medicamento_con_codigo")
    private Medicamento medicamento;
    
    @Column(name = "pac_observacao", length = 500)
    private String observacao;

    @Column(name = "pac_inicioMed", length = 50)
    private String inicioMed;

    @Column(name = "pac_finalMed", length = 50)
    private String finalMed;

    public Consulta() {
    }

    public Consulta(Integer codigo, String tipo, String data, String horario, String exame, String exameData, String exameResult, Paciente paciente, Medico medico, Medicamento medicamento, String observacao, String inicioMed, String finalMed) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.data = data;
        this.horario = horario;
        this.exame = exame;
        this.exameData = exameData;
        this.exameResult = exameResult;
        this.paciente = paciente;
        this.medico = medico;
        this.medicamento = medicamento;
        this.observacao = observacao;
        this.inicioMed = inicioMed;
        this.finalMed = finalMed;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }



    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public String getExameData() {
        return exameData;
    }

    public void setExameData(String exameData) {
        this.exameData = exameData;
    }

    public String getExameResult() {
        return exameResult;
    }

    public void setExameResult(String exameResult) {
        this.exameResult = exameResult;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public String getInicioMed() {
        return inicioMed;
    }

    public void setInicioMed(String inicioMed) {
        this.inicioMed = inicioMed;
    }

    public String getFinalMed() {
        return finalMed;
    }

    public void setFinalMed(String finalMed) {
        this.finalMed = finalMed;
    }

    @Override
    public String toString() {
        return "Consulta{" + "codigo=" + codigo + ", tipo=" + tipo + ", data=" + data + ", horario=" + horario + ", exame=" + exame + ", exameData=" + exameData + ", exameResult=" + exameResult + ", paciente=" + paciente + ", medico=" + medico + ", medicamento=" + medicamento + ", observacao=" + observacao + ", inicioMed=" + inicioMed + ", finalMed=" + finalMed + '}';
    }
    
}
