package repository.imp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import repository.bi.BaseRepositoryBI;

public class BaseHibernateRepository implements BaseRepositoryBI{

	public SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
