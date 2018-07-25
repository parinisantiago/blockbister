package model;

import java.util.Collection;
import java.util.HashSet;

public class Blockbister {

	private long id;
	private Collection<Persona> personas;
	private Collection<Catalogo> catalogos;
	private Collection<Pelicula> peliculas;
	private Collection<TipoPelicula> tipospelicula;
	private Collection<Renta> rentas;
	
	public Blockbister() {
		super();
		this.personas = new HashSet<Persona>();
		this.catalogos = new HashSet<Catalogo>();
		this.peliculas = new HashSet<Pelicula>();
		this.tipospelicula = new HashSet<TipoPelicula>();
		this.rentas = new HashSet<Renta>();
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Collection<Persona> getPersonas() {
		return personas;
	}
	
	public void setPersonas(Collection<Persona> personas) {
		this.personas = personas;
	}
	
	public Collection<Catalogo> getCatalogos() {
		return catalogos;
	}
	
	public void setCatalogos(Collection<Catalogo> catalogos) {
		this.catalogos = catalogos;
	}
	
	public Collection<Pelicula> getPeliculas() {
		return peliculas;
	}
	
	public void setPeliculas(Collection<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	public Collection<TipoPelicula> getTipospelicula() {
		return tipospelicula;
	}
	
	public void setTipospelicula(Collection<TipoPelicula> tipospelicula) {
		this.tipospelicula = tipospelicula;
	}
	
	public Collection<Renta> getRentas() {
		return rentas;
	}
	
	public void setRentas(Collection<Renta> rentas) {
		this.rentas = rentas;
	}
	
	public void addPersona(Persona persona) {
		this.personas.add(persona);
	}
}
