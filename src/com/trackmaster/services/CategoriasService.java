package com.trackmaster.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.trackmaster.modelo.Categoria;
import com.trackmaster.database.OracleDatabase;

public class CategoriasService {

	public static Categoria getById(Integer idCategoria)
	{
		Categoria categoria = new Categoria();
		
		try(OracleDatabase oc = new OracleDatabase())
		{
			List<Map<String, String>> lista = oc.executeQuery("SELECT * FROM CATEGORIA WHERE IDCATEGORIA = '" + idCategoria + "'");
			for(Map<String,String> m : lista)
			{
				categoria.setIdCategoria(Integer.parseInt(m.get("IDCATEGORIA")));
				categoria.setDescripcion(m.get("DESCRIPCION"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return categoria;
	}
	
	public static List<Categoria> getAll()
	{
		List<Categoria> categorias = new ArrayList<Categoria>();

		try(OracleDatabase oc = new OracleDatabase())
		{
			Categoria categoria = null;
			List<Map<String, String>> lista = oc.executeQuery("SELECT * FROM CATEGORIA");
			for(Map<String,String> m : lista)
			{
				categoria = new Categoria();
				
				categoria.setIdCategoria(Integer.parseInt(m.get("IDCATEGORIA")));
				categoria.setDescripcion(m.get("DESCRIPCION"));
				
				categorias.add(categoria);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return categorias;
	}

}
