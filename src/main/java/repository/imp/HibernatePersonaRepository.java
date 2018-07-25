package repository.imp;

import model.Blockbister;
import model.Persona;
import repository.bi.PersonaRepositoryBI;

public class HibernatePersonaRepository extends BaseHibernateRepository implements PersonaRepositoryBI{

	public Persona getPersona(String dni) {
		Persona persona = (Persona) this.getSession().createQuery("FROM Persona P WHERE P.dni="+dni).list().iterator().next();
		return persona;
	}

	@Override
	public Persona crearPersona(Persona persona) {
		Blockbister blockbister = (Blockbister) this.getSession().createQuery("FROM Blockbister").list().iterator().next();
		blockbister.addPersona(persona);
		return persona;
	}

}
