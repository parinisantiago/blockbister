package repository;

import repository.bi.BlockbisterRepositoryBI;
import repository.bi.CatalogoRepositoryBI;
import repository.bi.PeliculaRepositoryBI;
import repository.bi.PersonaRepositoryBI;
import repository.bi.RentaRepositoryBI;

public class RepositoryLocator {
	
	private static RepositoryLocator instance = null;
	private PersonaRepositoryBI personaRepository;
	private BlockbisterRepositoryBI blockbisterRepository;
	private PeliculaRepositoryBI peliculaRepository;
	private CatalogoRepositoryBI catalogoRepository;
	private RentaRepositoryBI rentaRepository;
	
	public static RepositoryLocator getInstance(){
		if(instance == null){
			instance = new RepositoryLocator();
		}
		return instance;
	}

	public PersonaRepositoryBI getPersonaRepository() {
		return personaRepository;
	}

	public void setPersonaRepository(PersonaRepositoryBI personaRepository) {
		this.personaRepository = personaRepository;
	}

	public BlockbisterRepositoryBI getBlockbisterRepository() {
		return blockbisterRepository;
	}

	public void setBlockbisterRepository(BlockbisterRepositoryBI blockbisterRepository) {
		this.blockbisterRepository = blockbisterRepository;
	}

	public PeliculaRepositoryBI getPeliculaRepository() {
		return peliculaRepository;
	}

	public void setPeliculaRepository(PeliculaRepositoryBI peliculaRepository) {
		this.peliculaRepository = peliculaRepository;
	}

	public CatalogoRepositoryBI getCatalogoRepository() {
		return catalogoRepository;
	}

	public void setCatalogoRepository(CatalogoRepositoryBI catalogoRepository) {
		this.catalogoRepository = catalogoRepository;
	}

	public RentaRepositoryBI getRentaRepository() {
		return rentaRepository;
	}

	public void setRentaRepository(RentaRepositoryBI rentaRepository) {
		this.rentaRepository = rentaRepository;
	}
	
	
}