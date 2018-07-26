package repository.imp;

import model.Blockbister;
import repository.bi.BlockbisterRepositoryBI;

public class HibernateBlockbisterRepository extends BaseHibernateRepository implements BlockbisterRepositoryBI{

	@Override
	public Blockbister getBlockbister() {
		Blockbister blockbister = (Blockbister) this.getSession().createQuery("FROM Blockbister").list().iterator().next();
		return blockbister;
	}

}