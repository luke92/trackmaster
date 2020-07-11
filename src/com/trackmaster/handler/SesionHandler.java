package com.trackmaster.handler;


import javax.servlet.http.HttpSession;

import com.trackmaster.modelo.Usuario;
import com.trackmaster.vista.CarroCompraVista;

public class SesionHandler {
	
	private HttpSession session;
	
	public SesionHandler(HttpSession session)
	{
		this.session = session;
	}
	
	public void setSession(HttpSession session) {
		this.session = session;
	}
	

	public HttpSession getSession() {
		return session;
	}
	
	public void setCarro(CarroCompraVista u)
	{
		this.getSession().setAttribute("carro", u);
		
	}
	
	public CarroCompraVista getCarro()
	{
		return (CarroCompraVista)this.getSession().getAttribute("carro");
	}
	
	public void cerrarSession(){
		this.getSession().invalidate();
	}
	
	public Usuario getUser()
	{
		CarroCompraVista c = (CarroCompraVista)this.getSession().getAttribute("carro");
		return c.getUsuario();
	}
}
