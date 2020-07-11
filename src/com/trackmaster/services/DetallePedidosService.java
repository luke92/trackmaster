package com.trackmaster.services;

import com.trackmaster.database.OracleDatabase;
import com.trackmaster.modelo.DetallePedido;
import com.trackmaster.modelo.ProductoAComprar;

public class DetallePedidosService {

	public static void save(DetallePedido detalle)
	{
		try(OracleDatabase oc = new OracleDatabase())
		{
			for(ProductoAComprar p : detalle.getProductos().getProductos())
			{
				
				oc.executeUpdate("INSERT INTO DETALLEPEDIDO (IDPEDIDO,IDPRODUCTO,CANTIDAD,SUBTOTAL) " +
						"VALUES ('" + detalle.getPedido().getIdPedido() + "','" + 
						p.getProducto().getIdProducto() + "','" +
					    p.getCantidad()+ "','" +
						p.getProducto().getPrecioUnitario() * p.getCantidad() + "')");
			}
		}
		catch(Exception e) { e.printStackTrace(); } 
	}
	
}
