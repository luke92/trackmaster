package com.trackmaster.modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductosAComprar implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<ProductoAComprar> productos;
	
	public ArrayList<ProductoAComprar> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<ProductoAComprar> productos) {
		this.productos = productos;
	}

	public ProductosAComprar()
	{
		productos = new ArrayList<ProductoAComprar>();
	}
	
	public void agregarProductoAComprar(Producto producto, Integer cantidad)
	{
		productos.add(new ProductoAComprar(producto,cantidad));
	}
	
	public ProductoAComprar getProductoAComprar(int iesimo)
	{
		return productos.get(iesimo);
	}
	
	public int getPrecioTotal()
	{
		int total = 0;
		for(ProductoAComprar x : productos)
		{
			total+= (x.getCantidad() * x.getProducto().getPrecioUnitario());
		}
		return total;
	}
}
