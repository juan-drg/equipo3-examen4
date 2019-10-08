package com.equipo3.computerestservice.model;

public class Cotizacion {

	private Double subtotal;
	private Double descuento;
	private Double subtotalcondescuento;
	private Double iva;
	private Double total;
	
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	public Double getSubtotalcondescuento() {
		return subtotalcondescuento;
	}
	public void setSubtotalcondescuento(Double subtotalcondescuento) {
		this.subtotalcondescuento = subtotalcondescuento;
	}
	public Double getIva() {
		return iva;
	}
	public void setIva(Double iva) {
		this.iva = iva;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public Cotizacion(Double subtotal, Double descuento, Double subtotalcondescuento, Double iva, Double total) {
		super();
		this.subtotal = subtotal;
		this.descuento = descuento;
		this.subtotalcondescuento = subtotalcondescuento;
		this.iva = iva;
		this.total = total;
	}
	
	public Cotizacion() {
		super();
	}
	
	
}
