package org.ensa.dao;





import org.ensa.entities.Personne;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class Dao implements Idao{
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void ajoutPersonne(Personne p) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(p);
	}

}
