package model;

public class Catalogo {

	private long id;
	private Pelicula pelicula;
	private TipoPelicula tipoPelicula;
	private int cantidad;
	
	public Catalogo(Pelicula pelicula, TipoPelicula tipoPelicula, int cantidad) {
		super();
		this.pelicula = pelicula;
		this.tipoPelicula = tipoPelicula;
		this.cantidad = cantidad;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Pelicula getPelicula() {
		return pelicula;
	}
	
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	public TipoPelicula getTipoPelicula() {
		return tipoPelicula;
	}
	
	public void setTipoPelicula(TipoPelicula tipoPelicula) {
		this.tipoPelicula = tipoPelicula;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
