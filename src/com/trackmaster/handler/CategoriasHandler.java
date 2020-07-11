package com.trackmaster.handler;

import java.util.List;

import com.trackmaster.modelo.Categoria;
import com.trackmaster.services.CategoriasService;


public class CategoriasHandler {

	public static List<Categoria> getAll()
	{
		return CategoriasService.getAll();
	}
}
