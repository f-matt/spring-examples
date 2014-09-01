package x.y.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import x.y.model.Bar;

@Repository
public class BarDaoImpl implements BarDao {
	
	@Autowired
	@Qualifier("sessionFactory2")
	private SessionFactory factory;
	
	public Bar get(int id) {
		Session session = factory.getCurrentSession();

		Query query = session.createQuery("from Bar where id = :id");
		query.setParameter("id", id);

		Bar bar  = (Bar) query.uniqueResult();
		
		return bar;
	}

}
