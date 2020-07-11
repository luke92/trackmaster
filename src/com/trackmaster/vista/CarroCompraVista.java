package com.trackmaster.vista;

import java.io.Serializable;

import com.trackmaster.modelo.DetallePedido;
import com.trackmaster.modelo.Pedido;
import com.trackmaster.modelo.Usuario;

public class CarroCompraVista implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario usuario;
	private Pedido pedido;
	private DetallePedido detalle;
	
	public CarroCompraVista()
	{
		usuario = new Usuario();
		pedido = new Pedido();
		detalle = new DetallePedido();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public DetallePedido getDetalle() {
		return detalle;
	}
	public void setDetalle(DetallePedido detalle) {
		this.detalle = detalle;
	}
	
	
}
