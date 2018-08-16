package dto;

import java.util.Date;

import com.google.gson.annotations.Expose;

import model.Pelicula;

public class PeliculaDTO {
	
	@Expose
	private long id;
	@Expose
	private String titulo;
	@Expose
	private String sinopsis;
	@Expose
	private Date estreno;
	
	public PeliculaDTO(Pelicula pelicula) {
		super();
		this.id = pelicula.getId();
		this.titulo = pelicula.getTitulo();
		this.sinopsis = pelicula.getSinopsis();
		this.estreno = pelicula.getEstreno();
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getSinopsis() {
		return sinopsis;
	}
	
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	
	public Date getEstreno() {
		return estreno;
	}
	
	public void setEstreno(Date estreno) {
		this.estreno = estreno;
	}
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
}
