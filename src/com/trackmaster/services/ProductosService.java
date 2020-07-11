package com.trackmaster.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.trackmaster.modelo.Producto;
import com.trackmaster.database.OracleDatabase;

public class ProductosService {
	
	public static Producto getById(Integer idProducto)
	{
		Producto producto = new Producto();
		try(OracleDatabase oc = new OracleDatabase())
		{
			List<Map<String, String>> lista = oc.executeQuery("SELECT * FROM PRODUCTO WHERE IDPRODUCTO = '" + idProducto + "'");
			
			for(Map<String,String> m : lista)
			{
				producto.setIdProducto(Integer.parseInt(m.get("IDPRODUCTO")));
				producto.setDescripcion(m.get("DESCRIPCION"));
				producto.setMarca(m.get("MARCA"));
				producto.setModelo(m.get("MODELO"));
				producto.setPrecioUnitario(Integer.parseInt(m.get("PRECIOUNITARIO")));
				producto.setStock(Integer.parseInt(m.get("STOCK")));
				producto.setUrlImagen(m.get("URLIMAGEN"));
				producto.setCategoria(CategoriasService.getById(Integer.parseInt(m.get("IDCATEGORIA"))));
			}
		}
		catch(Exception e) 
		{ 
			e.printStackTrace(); 
		}
		return producto;
	}
	
	public static List<Producto> getTopFive()
	{
		List<Producto> productos = new ArrayList<Producto>();
		try(OracleDatabase oc = new OracleDatabase())
		{
			List<Map<String, String>> lista = oc.executeQuery("SELECT * FROM PRODUCTO WHERE ROWNUM < 6");
			
			for(Map<String,String> m : lista)
			{
				Producto producto = new Producto();
				
				producto.setIdProducto(Integer.parseInt(m.get("IDPRODUCTO")));
				producto.setDescripcion(m.get("DESCRIPCION"));
				producto.setMarca(m.get("MARCA"));
				producto.setModelo(m.get("MODELO"));
				producto.setPrecioUnitario(Integer.parseInt(m.get("PRECIOUNITARIO")));
				producto.setStock(Integer.parseInt(m.get("STOCK")));
				producto.setUrlImagen(m.get("URLIMAGEN"));
				producto.setCategoria(CategoriasService.getById(Integer.parseInt(m.get("IDCATEGORIA"))));
				
				productos.add(producto);
			}
		}
		catch(Exception e) 
		{ 
			e.printStackTrace(); 
		}
		return productos;
	}
	
}
