package model;

import java.util.Date;

public class Pelicula {

	private long id;
	private String titulo;
	private String sinopsis;
	private Date estreno;
	
	public Pelicula(String titulo, String sinopsis, Date estreno) {
		super();
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.estreno = estreno;
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
