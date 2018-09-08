package repository.imp;


import java.util.Iterator;

import model.Blockbister;
import model.Persona;
import repository.bi.PersonaRepositoryBI;

public class HibernatePersonaRepository extends BaseHibernateRepository implements PersonaRepositoryBI{

	@SuppressWarnings("unchecked")
	@Override
	public Persona getPersona(String dni) throws Exception {
		Iterator<Persona> persona = this.getSession().createQuery("SELECT bp FROM Blockbister B INNER JOIN B.personas bp WHERE bp.dni ="+dni).list().iterator();
		if (!persona.hasNext()) throw new Exception("No existe la persona");
		else{
			return persona.next();
		}
	}

	@Override
	public Persona crearPersona(Persona persona) throws Exception {
		Blockbister blockbister = (Blockbister) this.getSession().createQuery("FROM Blockbister").list().iterator().next();
		blockbister.addPersona(persona);
		return persona;
	}

	@Override
	public Persona modificarPersona(Persona personaJSON){
		Persona persona = (Persona) this.getSession().createQuery("FROM Persona P WHERE P.dni="+personaJSON.getDni()).list().iterator().next();
		persona.modificar(personaJSON);
		return persona;
	}

	@Override
	public Persona borrarPersona(int dni) {
		Persona persona = (Persona) this.getSession().createQuery("FROM Persona P WHERE P.dni="+dni).list().iterator().next();
		Blockbister blockbister = (Blockbister) this.getSession().createQuery("FROM Blockbister").list().iterator().next();
		blockbister.removePersona(persona);
		return persona;
	}
	
}
