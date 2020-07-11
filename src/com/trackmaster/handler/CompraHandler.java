package com.trackmaster.handler;

import com.trackmaster.modelo.Producto;
import com.trackmaster.modelo.ProductosAComprar;

public class CompraHandler
{
	public static ProductosAComprar getProductos(String[] ids, String[] cantidades)
	{
		ProductosAComprar lista = new ProductosAComprar();
		Producto producto = null;
		Integer cantidad = null;
		for(int i = 0; i < ids.length; i++)
		{
			producto = ProductosHandler.getById(Integer.parseInt(ids[i]));
			cantidad = Integer.parseInt(cantidades[i]);
			lista.agregarProductoAComprar(producto, cantidad);
		}
		return lista;
		
	}
	
	
}
