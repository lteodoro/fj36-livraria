package br.com.caelum.livraria.jaxb;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Livro {
	
	private String codigo;
	private String titulo;
	private String nomeAutor;
	private BigDecimal valor;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Livro [codigo=" + codigo + ", titulo=" + titulo + 
				", nomeAutor=" + nomeAutor + ", valorImpresso=" + valor + "]";
	}
		
}
