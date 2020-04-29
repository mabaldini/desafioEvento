package com.qintess.bd.Entidades;

public class CompraEvento {
	private CompraId id;
	private Compra compra;
	private Evento evento;
	private int quantidade;

	public CompraEvento(Compra compra, Evento evento, int quantidade) {
		this.compra = compra;
		this.evento = evento;
		this.quantidade = quantidade;
		this.id = new CompraId(compra.getId(), evento.getId());
	}

	public CompraId getId() {
		return id;
	}

	public void setId(CompraId id) {
		this.id = id;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
