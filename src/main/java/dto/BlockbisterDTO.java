package dto;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.google.gson.annotations.Expose;

import model.Blockbister;
import model.Catalogo;
import model.Pelicula;
import model.Persona;
import model.Renta;
import model.TipoPelicula;

public class BlockbisterDTO {

	private long id;
	@Expose
	private Collection<PersonaDTO> personas;
	@Expose
	private Collection<CatalogoDTO> catalogos;
	@Expose
	private Collection<PeliculaDTO> peliculas;
	@Expose
	private Collection<TipoPeliculaDTO> tipospelicula;
	@Expose
	private Collection<RentaDTO> rentas;
	
	public BlockbisterDTO(Blockbister blockbister) {
		this.personas = new HashSet<PersonaDTO>();
		this.catalogos = new HashSet<CatalogoDTO>();
		this.peliculas = new HashSet<PeliculaDTO>();
		this.tipospelicula = new HashSet<TipoPeliculaDTO>();
		this.rentas = new HashSet<RentaDTO>();
		
		Iterator<Persona> personaI = blockbister.getPersonas().iterator();
		while(personaI.hasNext()) {
			this.personas.add(new PersonaDTO(personaI.next()));
		}
		
		Iterator<Catalogo> catalogoI = blockbister.getCatalogos().iterator();
		while(catalogoI.hasNext()) {
			this.catalogos.add(new CatalogoDTO(catalogoI.next()));
		}
		
		Iterator<Pelicula> peliculaI = blockbister.getPeliculas().iterator();
		while(peliculaI.hasNext()) {
			this.peliculas.add(new PeliculaDTO(peliculaI.next()));
		}
		
		Iterator<TipoPelicula> tipoPeliculaI = blockbister.getTipospelicula().iterator();
		while(tipoPeliculaI.hasNext()) {
			this.tipospelicula.add(new TipoPeliculaDTO(tipoPeliculaI.next()));
		}
		
		Iterator<Renta> rentaI = blockbister.getRentas().iterator();
		while(rentaI.hasNext()) {
			this.rentas.add(new RentaDTO(rentaI.next()));
		}

	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Collection<PersonaDTO> getPersonas() {
		return personas;
	}
	
	public void setPersonas(Collection<PersonaDTO> personas) {
		this.personas = personas;
	}
	
	public Collection<CatalogoDTO> getCatalogos() {
		return catalogos;
	}
	
	public void setCatalogos(Collection<CatalogoDTO> catalogos) {
		this.catalogos = catalogos;
	}
	
	public Collection<PeliculaDTO> getPeliculas() {
		return peliculas;
	}
	
	public void setPeliculas(Collection<PeliculaDTO> peliculas) {
		this.peliculas = peliculas;
	}
	
	public Collection<TipoPeliculaDTO> getTipospelicula() {
		return tipospelicula;
	}
	
	public void setTipospelicula(Collection<TipoPeliculaDTO> tipospelicula) {
		this.tipospelicula = tipospelicula;
	}
	
	public Collection<RentaDTO> getRentas() {
		return rentas;
	}
	
	public void setRentas(Collection<RentaDTO> rentas) {
		this.rentas = rentas;
	}
	
}
