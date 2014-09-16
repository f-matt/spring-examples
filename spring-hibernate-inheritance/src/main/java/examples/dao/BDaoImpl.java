package examples.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import examples.model.B;

@Repository
public class BDaoImpl implements BDao {
	
	@Autowired
	private SessionFactory factory;

	public List<B> getAll() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from B");

		@SuppressWarnings("unchecked")
		List<B> bList = (List<B>) query.list();

		return bList;
	}

}
