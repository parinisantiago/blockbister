package repository;

import repository.bi.BlockbisterRepositoryBI;
import repository.bi.PeliculaRepositoryBI;
import repository.bi.PersonaRepositoryBI;

public class RepositoryLocator {
	
	private static RepositoryLocator instance = null;
	private PersonaRepositoryBI personaRepository;
	private BlockbisterRepositoryBI blockbisterRepository;
	private PeliculaRepositoryBI peliculaRepository;
	
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
	
	
}