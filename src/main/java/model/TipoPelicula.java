package model;

public class TipoPelicula {

	private long id;
	private String tipo;
	private float precio;
	
	public TipoPelicula(String tipo, float precio) {
		super();
		this.tipo = tipo;
		this.precio = precio;
	}
	
	public TipoPelicula(){
		super();
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
