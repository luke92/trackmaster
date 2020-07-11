package com.trackmaster.modelo;

import java.io.Serializable;

public class ProductoAComprar implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6993814434266999127L;
	private Producto producto;
	private Integer cantidad;
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public ProductoAComprar(Producto producto, Integer cantidad)
	{
		this.cantidad = cantidad;
		this.producto = producto;
	}
}
