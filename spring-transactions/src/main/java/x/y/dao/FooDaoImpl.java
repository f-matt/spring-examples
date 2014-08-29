package x.y.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import x.y.model.Foo;

@Repository
public class FooDaoImpl implements FooDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory factory;

	public Foo get(int id) {
		Session session = factory.getCurrentSession();

		Query query = session.createQuery("from Foo where id = :id");
		query.setParameter("id", id);

		Foo foo  = (Foo) query.uniqueResult();
		
		return foo;
	}

}
