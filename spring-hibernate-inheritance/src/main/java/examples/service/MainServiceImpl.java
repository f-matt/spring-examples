package examples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import examples.dao.BDao;
import examples.dao.CDao;
import examples.model.B;
import examples.model.C;

@Service
@Transactional
public class MainServiceImpl implements MainService {
	
	@Autowired
	private BDao bDao;
	
	@Autowired
	private CDao cDao;

	public List<B> getAllB() {
		return bDao.getAll();
	}

	public List<C> getAllC() {
		return cDao.getAll();
	}

}
