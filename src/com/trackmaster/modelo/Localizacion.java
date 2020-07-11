package com.trackmaster.modelo;

import java.io.Serializable;

public class Localizacion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1822241726492738084L;
	private Pedido pedido;
	private int		idLocalizacion;
	private Usuario usuario;
	private String fecha;
	private double	latitud;
	private double 	longitud;
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public int getIdLocalizacion() {
		return idLocalizacion;
	}
	public void setIdLocalizacion(int idLocalizacion) {
		this.idLocalizacion = idLocalizacion;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	
	
}
