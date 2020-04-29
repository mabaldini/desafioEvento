package com.qintess.bd.Entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {
	private static final int CompraEvento = 0;
	private int id;
	private int qtdIngressos;
	private String nome;
	private BigDecimal valorUnitario;
	private LocalDate dtEvento;
	private String descricao;
	private List<CompraEvento> compras = new ArrayList<CompraEvento>();
	private CasaDeShow casaDeShow;
	

	public List<CompraEvento> getCompras() {
		return compras;
	}

	public void setCompras(List<CompraEvento> compras) {
		this.compras = compras;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdIngressos() {
		return qtdIngressos = qtdIngressos - CompraEvento;
	}

	public void setQtdIngressos(int qtdIngressos) {
		this.qtdIngressos = qtdIngressos;
	}

	public LocalDate getDtEvento() {
		return dtEvento;
	}

	public void setDtEvento(LocalDate dtEvento) {
		this.dtEvento = dtEvento;
	}

	public CasaDeShow getCasaDeShow() {
		return casaDeShow;
	}

	public void setCasaDeShow(CasaDeShow casaDeShow) {
		this.casaDeShow = casaDeShow;
	}

}

