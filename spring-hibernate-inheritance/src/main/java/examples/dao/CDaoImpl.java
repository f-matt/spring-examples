package examples.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import examples.model.C;

@Repository
public class CDaoImpl implements CDao {
	
	@Autowired
	private SessionFactory factory;

	public List<C> getAll() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from C");

		@SuppressWarnings("unchecked")
		List<C> cList = (List<C>) query.list();

		return cList;
	}
	

}
