package model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

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
	
	public void addPersona(Persona persona) throws Exception {
		
		if (this.personas.stream().filter(x -> x.getDni() == persona.getDni()).findAny().isPresent()) throw new Exception("Ya existe una persona registrada con ese dni");
		
		this.personas.add(persona);
	}

	public void addPelicula(Pelicula pelicula) throws Exception {
		if (this.peliculas.stream().filter(x -> x.getTitulo() == pelicula.getTitulo()).findAny().isPresent()) throw new Exception("Ya existe una pelicula registrada con ese titulo");

		this.peliculas.add(pelicula);
	}

	public void addCatalogo(Catalogo catalogo) {
		this.catalogos.add(catalogo);
	}

	public void addRenta(Renta renta) {
		this.rentas.add(renta);
	}

	public void addTipoPelicula(TipoPelicula tipoPelicula) {
		this.tipospelicula.add(tipoPelicula);
		Iterator<Pelicula> peliculaIterator = this.peliculas.iterator();
		while(peliculaIterator.hasNext()) 
		{
			this.catalogos.add(new Catalogo(peliculaIterator.next(),tipoPelicula,0));
		}
	}

	public void removePersona(Persona persona) {
		this.personas.remove(persona);
		
	}

	public void removePelicula(Pelicula pelicula) {
		this.peliculas.remove(pelicula);
	}
}
