package com.trackmaster.modelo;

import java.io.Serializable;


public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8809384897785713711L;
	private String	idUsuario;
	private String 	nombre;
	private String	apellido;
	private	String	email;
	private String	estadoCuenta;
	private	String	direccionEnvio;
	private String  password;
	private String rol;
	
	public enum Estado
	{
		ACTIVO,
		DESACTIVO
	}
	
	public enum ROLES
	{
		CLIENTE,
		ADMINISTRATIVO
	}
	
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEstadoCuenta() {
		return estadoCuenta;
	}
	public void setEstadoCuenta(String estadoCuenta) {
		this.estadoCuenta = estadoCuenta;
	}
	public String getDireccionEnvio() {
		return direccionEnvio;
	}
	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
