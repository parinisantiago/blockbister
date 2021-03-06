package dto;

import model.Blockbister;
import model.Catalogo;
import model.Pelicula;
import model.Persona;
import model.Renta;
import model.TipoPelicula;

public class DTOFactory {

	private static DTOFactory instance = null;	
	
	public static DTOFactory getInstance(){
		if (instance == null) {
			instance = new DTOFactory();
		}
		return instance;
	}
	
	public PersonaDTO getPersonaDTO(Persona persona) {
		return new PersonaDTO(persona);
	}
	
	public BlockbisterDTO getBlockbisterDTO(Blockbister blockbister)
	{
		return new BlockbisterDTO(blockbister);
	}
	
	public PeliculaDTO getPeliculaDTO(Pelicula pelicula)
	{
		return new PeliculaDTO(pelicula);
	}
	
	public CatalogoDTO getCatalagoDTO(Catalogo catalogo)
	{
		return new CatalogoDTO(catalogo);
	}
	
	public RentaDTO getRentaDTO(Renta renta)
	{
		return new RentaDTO(renta);
	}
	public TipoPeliculaDTO getTipoPeliculaDTO(TipoPelicula tipoPelicula)
	{
		return new TipoPeliculaDTO(tipoPelicula);
	}
}
