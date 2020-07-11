package com.trackmaster.handler;

import com.trackmaster.modelo.Usuario;
import com.trackmaster.services.UsuarioService;
import com.trackmaster.vista.CarroCompraVista;

public class UsuarioHandler {
	
	public static CarroCompraVista nuevoCarro(String usuario)
	{
		Usuario user = new Usuario();
		user = UsuarioService.getById(usuario);
		CarroCompraVista carro = new CarroCompraVista();
		carro.setUsuario(user);
		
		return carro;
	}
}
