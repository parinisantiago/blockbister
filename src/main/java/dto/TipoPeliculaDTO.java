package dto;

import com.google.gson.annotations.Expose;

import model.TipoPelicula;

public class TipoPeliculaDTO {
	
	private long id;
	@Expose
	private String tipo;
	@Expose
	private float precio;
	
	public TipoPeliculaDTO(TipoPelicula tipoPelicula) {
		super();
		this.id = tipoPelicula.getId();
		this.tipo = tipoPelicula.getTipo();
		this.precio = tipoPelicula.getPrecio();
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
