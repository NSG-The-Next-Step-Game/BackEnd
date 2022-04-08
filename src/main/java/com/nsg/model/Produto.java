package com.nsg.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O campo nome deve ser preenchido")
	@Size(min = 3, max = 255, message = "O nome deve ter no mínimo 3 e no máximo 255 caracteres")
	private String nome;
	
	@NotBlank(message = "O campo descrição deve ser preenchido")
	@Size(min = 10, max = 500, message = "A descrição deve ter no mínimo 10 e no máximo 500 caracteres")
	private String descricao;
	
	@NotBlank(message = "O campo preço deve ser preenchido")
	private Double preco;
	
	@NotBlank(message = "O campo tipo deve ser preenchido como mídia física ou digital")
	@Size(min = 6, max = 255, message = "O tipo deve ter no mínimo 6 e no máximo 255 caracteres")
	private String tipo;
	
	@NotBlank(message = "O campo classificação indicativa deve ser preenchido")
	@Size(min = 2, max = 255, message = "A classificação indicativa deve ter no mínimo 2 e no máximo 255 caracteres")
	private String classInd;
	
	@NotBlank(message = "O campo console deve ser preenchido")
	@Size(min = 2, max = 255, message = "O console deve ter no mínimo 2 e no máximo 255 caracteres")
	private String console;
	
	@NotBlank(message = "O campo foto deve ser preenchido")
	private String foto;
	
	@UpdateTimestamp
	private LocalDateTime dataProduto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getClassInd() {
		return classInd;
	}

	public void setClassInd(String classInd) {
		this.classInd = classInd;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public LocalDateTime getDataProduto() {
		return dataProduto;
	}

	public void setDataProduto(LocalDateTime dataProduto) {
		this.dataProduto = dataProduto;
	}
}
