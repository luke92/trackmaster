package com.trackmaster.handler;


import javax.servlet.http.HttpSession;

import com.trackmaster.vista.CarroCompraVista;

public class Sesion {
	
	private HttpSession session;
	
	public Sesion(HttpSession session)
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

}
