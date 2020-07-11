package com.trackmaster.services;

import java.util.List;
import java.util.Map;

import com.trackmaster.modelo.Usuario;
import com.trackmaster.database.OracleDatabase;

public class UsuarioService  {
	
	public static Usuario getById(String user)
	{
		Usuario usuario = new Usuario();
		try(OracleDatabase oc = new OracleDatabase())
		{
		
			List<Map<String, String>> lista = oc.executeQuery("SELECT * FROM USUARIO WHERE IDUSUARIO = '" + user + "'");
			
			for(Map<String,String> m : lista)
			{
				usuario.setIdUsuario(m.get("IDUSUARIO"));
				usuario.setPassword(m.get("PASSWORD"));
				usuario.setNombre(m.get("NOMBRE"));
				usuario.setApellido(m.get("APELLIDO"));
				usuario.setEmail(m.get("EMAIL"));
				usuario.setEstadoCuenta(m.get("ESTADO"));
				usuario.setDireccionEnvio(m.get("DIRECCIONENVIO"));
				usuario.setRol(m.get("ROL"));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return usuario;
	}

}