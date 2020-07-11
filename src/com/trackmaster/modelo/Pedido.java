package com.trackmaster.modelo;

import java.io.Serializable;
import java.util.Date;

public class Pedido implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1144438455169779453L;
	private int 	idPedido;
	private Date	fechaPedido;
	private double	precioTotal;
	public EstadoEnvio estado;
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public enum EstadoEnvio
	{
		EN_TRANSITO,
		ALERTA,
		FINALIZADO,
		ENVIADO,
		NO_ENVIADO
	}
	
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public EstadoEnvio getEstado() {
		return estado;
	}
	public void setEstado(EstadoEnvio estado) {
		this.estado = estado;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

}
