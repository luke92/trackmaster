package com.trackmaster.handler;

import java.util.List;

import com.trackmaster.modelo.Producto;
import com.trackmaster.services.ProductosService;

public class ProductosHandler {
	
	public static List<Producto> getTopFive()
	{
		return ProductosService.getTopFive();
	}
	
	public static Producto getById(int id)
	{
		return ProductosService.getById(id);
	}
	
	/**
	 * @param args
	 */
	/*private ArrayList<Producto> listaProductos =new ArrayList<Producto>();
	/**
	 * @param args
	 */
	/*public ArrayList<Producto> cargarArrayProductos(){
		ArrayList <Producto> productosMostrar2 = new ArrayList<Producto>();
		//VALIDA LAS CATEGORIAS EN LA BD ORACLE 
		ProductosService productosServ =new ProductosService();
		//productosMostrar2 = productosServ.devuelveProductos();//deberia devolver toda la tabla productos
		
		return productosMostrar2;
	}
	
	public Producto cargarArrayUnProducto(int idproducto){
		Producto productoAux = new Producto();
		//VALIDA LAS CATEGORIAS EN LA BD ORACLE 
		ProductosService productosServ =new ProductosService();
		//productoAux = productosServ.devuelveUnProducto(idproducto);//deberia devolver un registro de  la tabla productos
		return productoAux;
	}
	
	
		public String getProductos(int id){	
		String htmlcode="";
		Producto productoAux =new Producto();
		productoAux= cargarArrayUnProducto(id);
		//se entiende que carga el registro de un producto entero (idproducto,, marca,modelo,etc)
		 htmlcode = "<div class=\"col-sm-4\">\n" +
"							<div class=\"product-image-wrapper\">\n" +
"								<div class=\"single-products\">\n" +
"									<div class=\"productinfo text-center\">\n" +
"										<img src=\""+ productoAux.getUrlImagen().toString() + "\" width=300" + "\" height=200"+ "\" alt=\"\" />\n" +
"										<h2>$"+ productoAux.getPrecioUnitario()+"</h2>\n" +
"										<p>"+productoAux.getDescripcion().toString()+"</p>\n" +
"										<a href=\"product-details.jsp?id="+productoAux.getIdProducto()+"\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Ver detalles</a>\n" +
"									</div>\n" +
"								</div>\n" +
"								<div class=\"choose\">\n" +
"									<ul class=\"nav nav-pills nav-justified\">\n" +
										"<button type=submit" + "\"	value= Añadir al carrito +  id=AñadirCarrito  width=600  height=300  </button>"+ //añadir al carrito
"									</ul>\n" +
"								</div>\n" +
"							</div>\n" +
"						</div>";
		return htmlcode;
	}
		
	public String getDetalles(){
		return null;
		
	}*/
}
