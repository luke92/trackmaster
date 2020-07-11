package com.trackmaster.modelo;

import java.io.Serializable;

public class DetallePedido implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7385247429973782129L;
	private Pedido pedido;
	private ProductosAComprar productos;
	
	public DetallePedido()
	{
		pedido = new Pedido();
		productos = new ProductosAComprar();
	}
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public ProductosAComprar getProductos() {
		return productos;
	}
	public void setProductos(ProductosAComprar productos) {
		this.productos = productos;
	}
	
	public void addProduct(Producto producto, Integer cantidad)
	{
		this.productos.agregarProductoAComprar(producto, cantidad);
	}
	
	public ProductoAComprar getProduct(Integer iesimo)
	{
		return this.productos.getProductoAComprar(iesimo);
	}
}

