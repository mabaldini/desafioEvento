package com.qintess.bd.Entidades;

import java.util.Objects;

public class CompraId {
	private int compraId;
	private int eventoId;

	public CompraId(int compraId, int eventoId) {
		this.compraId = compraId;
		this.eventoId = eventoId;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass())
			return false;

		CompraId that = (CompraId) o;
		return Objects.equals(compraId, that.compraId) && Objects.equals(eventoId, that.eventoId);
	}

	public int hashCode() {
		return Objects.hash(compraId, eventoId);
	}

	public int getCompraId() {
		return compraId;
	}

	public void setCompraId(int compraId) {
		this.compraId = compraId;
	}

	public int getEventoId() {
		return eventoId;
	}

	public void setEventoId(int eventoId) {
		this.eventoId = eventoId;
	}

}
