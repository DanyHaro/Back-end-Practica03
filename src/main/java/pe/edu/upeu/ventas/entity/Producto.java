package pe.edu.upeu.ventas.entity;

public class Producto {
private int idproducto;
private String nom_prod;
private double precio;
private int cantidad;
private int idcategoria;
public Producto() {
	super();
}

public Producto(int idproducto, String nom_prod, double precio, int cantidad, int idcategoria) {
	super();
	this.idproducto = idproducto;
	this.nom_prod = nom_prod;
	this.precio = precio;
	this.cantidad = cantidad;
	this.idcategoria = idcategoria;
}

public Producto(String nom_prod, double precio, int cantidad, int idcategoria) {
	super();
	this.nom_prod = nom_prod;
	this.precio = precio;
	this.cantidad = cantidad;
	this.idcategoria = idcategoria;
}
public int getIdproducto() {
	return idproducto;
}
public void setIdproducto(int idproducto) {
	this.idproducto = idproducto;
}
public String getNom_prod() {
	return nom_prod;
}
public void setNom_prod(String nom_prod) {
	this.nom_prod = nom_prod;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public int getIdcategoria() {
	return idcategoria;
}
public void setIdcategoria(int idcategoria) {
	this.idcategoria = idcategoria;
}

}
