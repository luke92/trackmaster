package com.trackmaster.services;


import com.trackmaster.database.OracleDatabase;
import com.trackmaster.modelo.Pedido;

public class PedidosService 
{
	
	public static void save(Pedido pedido)
	{
		try(OracleDatabase oc = new OracleDatabase())
		{
			oc.executeUpdate("INSERT INTO PEDIDO (IDPEDIDO,IDUSUARIO,FECHAPEDIDO,TOTAL,ESTADO) " +
					"VALUES ('" + pedido.getIdPedido() + "','" + 
					pedido.getUsuario().getIdUsuario() + "', SYSDATE,'" +
					pedido.getPrecioTotal() + "','" +
					pedido.getEstado() + "')");
		}
		catch(Exception e) { e.printStackTrace(); } 
	}
	
	public static int getLastId()
	{
		int id = 0;
		try(OracleDatabase oc = new OracleDatabase())
		{
			id = oc.getLastId("IDPEDIDO", "PEDIDO");
			
		}
		catch(Exception e) { e.printStackTrace();}
		return id;

	}
}