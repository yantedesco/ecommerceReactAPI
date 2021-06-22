package br.org.serratec.backend.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "endereco")
@Data
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;	

	@NotNull
	@Size(min=4, max=60)
	@Column(name = "logradouro", nullable = false, length = 60)
	private String rua;

	@NotNull
	@Size(min=1, max=20)
	@Column(name = "numero", nullable = false, length = 20)
	private String numero;

	@Size(min=0, max=30)
	@Column(name = "complemento", nullable = false, length = 30)
	private String complemento;

	@Size(min=0, max=40)
	@Column(name = "bairro",  length = 40)
	private String bairro;

	@NotNull
	@Size(min=3, max=40)
	@Column(name = "cidade", nullable = false, length = 40)
	private String cidade;

	@NotNull
	@Size(min=0, max=2)
	@Column(name = "uf", nullable = false, length = 2)
	private String estado;

	@NotNull
	@Column(name = "cep", nullable = false, length = 40)
	private String cep;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}