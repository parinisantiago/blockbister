package service.imp;

import java.util.Collection;
import java.util.Iterator;

import org.springframework.transaction.annotation.Transactional;

import dto.DTOFactory;
import dto.PeliculaDTO;
import model.Blockbister;
import model.Catalogo;
import model.Pelicula;
import model.TipoPelicula;
import repository.RepositoryLocator;
import service.bi.PeliculaServiceBI;

@Transactional
public class PeliculaServiceImp implements PeliculaServiceBI{

	@Override
	public PeliculaDTO getPelicula(String id) throws Exception {
		
		Iterator<Pelicula> pelicula = RepositoryLocator.getInstance().getPeliculaRepository().getPelicula(id);
		if (!pelicula.hasNext()) throw new Exception("No existe la peli");
		else{
			return DTOFactory.getInstance().getPeliculaDTO(pelicula.next());

		}
	}

	@Override
	public PeliculaDTO crearPelicula(Pelicula pelicula) throws Exception {
		Blockbister blockbister = RepositoryLocator.getInstance().getBlockbisterRepository().getBlockbister();
		blockbister.addPelicula(pelicula);
		Iterator<TipoPelicula> tipoPeliculas = RepositoryLocator.getInstance().getCatalogoRepository().crearCatalogo(pelicula);
		while(tipoPeliculas.hasNext()) {
			TipoPelicula tipoPelicula = tipoPeliculas.next();
			Catalogo catalogo = new Catalogo(pelicula, tipoPelicula, 0);
			blockbister.addCatalogo(catalogo);
		}
		return DTOFactory.getInstance().getPeliculaDTO(pelicula);
	}

	@Override
	public PeliculaDTO modificarPelicula(Pelicula pelicula) {
		Pelicula peliculaRepo = RepositoryLocator.getInstance().getPeliculaRepository().modificarPelicula(pelicula);
		peliculaRepo.modificar(pelicula); 
		return DTOFactory.getInstance().getPeliculaDTO(peliculaRepo);
	}

	@Override
	public Collection<PeliculaDTO> getPeliculas() {
		return DTOFactory.getInstance().getBlockbisterDTO(RepositoryLocator.getInstance().getBlockbisterRepository().getBlockbister()).getPeliculas();
	}

	@Override
	public PeliculaDTO borrarPelicula(long id) {
		
		Pelicula pelicula = RepositoryLocator.getInstance().getPeliculaRepository().borrarPelicula(id);
		Blockbister blockbister = RepositoryLocator.getInstance().getBlockbisterRepository().getBlockbister();
		blockbister.removePelicula(pelicula);
		return DTOFactory.getInstance().getPeliculaDTO(pelicula);
	}

}
