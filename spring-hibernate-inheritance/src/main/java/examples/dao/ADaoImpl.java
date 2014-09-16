package examples.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import examples.model.A;

@Repository
public class ADaoImpl implements ADao {

	@Autowired
	private SessionFactory factory;
	
	public List<A> getAll() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from A");

		@SuppressWarnings("unchecked")
		List<A> aList = (List<A>) query.list();

		return aList;
	}

}
