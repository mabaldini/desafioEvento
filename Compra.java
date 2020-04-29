package com.qintess.bd.Entidades;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Compra {
	private int id;
	private BigDecimal valor = new BigDecimal(0);
	private Cliente cliente;
	private List<CompraEvento> eventos = new ArrayList<CompraEvento>();

	public void adEvento(Evento evento, int qtd) {
		CompraEvento compraEvento = new CompraEvento(this, evento, qtd);
		eventos.add(compraEvento);
		evento.getCompras().add(compraEvento);
		double valorCompra = this.valor.doubleValue();
		double valorEventoUnit = evento.getValorUnitario().doubleValue();
		valorCompra += (valorEventoUnit * qtd);

		this.valor = new BigDecimal(valorCompra);
	}

	public int getId() {
		return 0;
	}

}
