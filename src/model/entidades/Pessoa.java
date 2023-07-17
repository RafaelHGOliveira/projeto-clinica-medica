package model.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pes_codigo", nullable = false)
    private Integer codigo;

    @Column(name = "pes_nome", length = 45, nullable = false)
    private String nome;

    @Column(name = "pes_nascimento", length = 11, nullable = false)
    private String nascimento;

    @Column(name = "pes_cpf", length = 14, nullable = false)
    private String cpf;

    @Column(name = "pes_rg", length = 12, nullable = false)
    private String rg;

    @Column(name = "pes_rua", length = 45, nullable = false)
    private String rua;

    @Column(name = "pes_numero", length = 10, nullable = false)
    private String numero;

    @Column(name = "pes_complemento", length = 20)
    private String complemento;

    @Column(name = "pes_bairro", length = 20)
    private String bairro;
    
    @Column(name = "pes_cidade", length = 45, nullable = false)
    private String cidade;
    
    @Column(name = "pes_estado", length = 3, nullable = false)
    private String estado;

    @Column(name = "pes_cep", length = 10, nullable = false)
    private String cep;

    @Column(name = "pes_email", length = 45)
    private String email;

    @Column(name = "pes_sexo", length = 10, nullable = false)
    private String sexo;

    @Column(name = "pes_telefone", length = 15)
    private String telefone;

    @Column(name = "pes_celular", length = 15)
    private String celular;

    /**
     * Construtor padrão da classe Pessoa.
     */
    public Pessoa() {

    }

    /**
     * Construtor completo da classe Pessoa.
     *
     * @param codigo -> ID do tipo Integer definido para a hierarquia da
     * entidade.
     * @param nome -> Atributo que deverá ser preenchido com nome completo,
     * String com no máximo 45 caracteres,não poderá ser nulo.
     * @param nascimento-> Atributo do tipo inteiro que deverá ser preenchido
     * com a data de nascimento, não poderá ser nulo.
     * @param cpf-> Atributo que deverá ser preenchido com cpf do titular com
     * pontos e traços, não poderá ser nulo. É do tipo String e terá no máximo
     * 14 caracteres.
     * @param rg-> Atributo que deverá ser preenchido com o rg completo, com
     * pontos e traços; não poderá ser nulo. Do tipo String, terá no máximo 12
     * caracteres.
     * @param rua-> Atributo do tipo String que deverá conter o endereço da
     * Pessoa, Av., rua, Logradouro. Terá no máximo 45 caracteres. Não poderá
     * ficar vazio.
     * @param numero-> Atributo do tipo String que conterá o número residencial,
     * e caso necessário a quadra também. Terá no máximo 5 caracteres. Não
     * poderá ser nulo.
     * @param complemento-> Atributo do tipo String que diz respeito ao
     * complemento do endereço, como apto, bloco, etc. Terá no máximo 45
     * caracteres. Poderá ser nulo.
     * @param bairro-> Atributo que conterá o nome do bairro em que a Pessoa
     * reside, do tipo String com no máximo 45 caracteres. Não poderá ser vazio.
     * @param cep-> Atributo do tipo String que deverá ser preenchido com o cep,
     * com no máximo 25 caracteres.
     * @param email-> Atributo do tipo String que deverá conter o email da
     * Pessoa. Com no máximo 45 caracteres. Poderá ser nulo.
     * @param sexo-> Atributo que conterá o gênero sexual da Pessoa. É do tipo
     * String e terá no máximo 10 caracteres. Não poderá ficar vazio.
     * @param telefone-> Atributo do tipo String que irá conter o 
     * telefone para contato da Pessoa. Terá no máximo 15 caracteres.
     * Podera ser nula
     * @param celular-> Atributo do tipo String que irá conter um celular
     * para contato alternativo da Pessoa. Poderá ser nulo. Contêm no máximo 15
     * caracteres.
     * @param cidade->Atributo do tipo String que armazenará no máximo 45 caracteres. Não poderá ser nulo.
     * @param estado-> Atributo do tipo String que armazenará no máximo 45 caracteres. Não deverá ser nulo.
     */
    public Pessoa(Integer codigo, String nome, String nascimento, String cpf, String rg, String rua, String numero, String complemento, String bairro, String cidade, String estado, String cep, String email, String sexo, String telefone, String celular) {
        this.codigo = codigo;
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.email = email;
        this.sexo = sexo;
        this.telefone = telefone;
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", nome=" + nome + ", nascimento=" + nascimento + ", cpf=" + cpf + ", rg=" + rg + ", rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", email=" + email + ", sexo=" + sexo + ", telefone=" + telefone + ", celular=" + celular + '}';
    }

}
