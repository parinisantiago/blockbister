package dto;

import com.google.gson.annotations.Expose;

import model.Catalogo;

public class CatalogoDTO {
	
	private long id;
	@Expose
	private PeliculaDTO pelicula;
	@Expose
	private TipoPeliculaDTO tipoPelicula;
	@Expose
	private int cantidad;
	
	public CatalogoDTO(Catalogo catalogo) {
		super();
		this.id = catalogo.getId();
		this.pelicula = new PeliculaDTO(catalogo.getPelicula());
		this.tipoPelicula = new TipoPeliculaDTO(catalogo.getTipoPelicula());
		this.cantidad = catalogo.getCantidad();
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public PeliculaDTO getPelicula() {
		return pelicula;
	}
	
	public void setPelicula(PeliculaDTO pelicula) {
		this.pelicula = pelicula;
	}
	
	public TipoPeliculaDTO getTipoPelicula() {
		return tipoPelicula;
	}
	
	public void setTipoPelicula(TipoPeliculaDTO tipoPelicula) {
		this.tipoPelicula = tipoPelicula;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
