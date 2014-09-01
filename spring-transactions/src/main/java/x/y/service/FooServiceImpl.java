package x.y.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import x.y.dao.FooDao;
import x.y.model.FooBarDto;

@Service
public class FooServiceImpl implements FooService {

	@Autowired
	private FooDao fooDao;
	
	@Autowired
	private BarService barService;
	
	@Transactional(value="transactionManager", readOnly=true)
	public FooBarDto createDto(int id) {
		return barService.createDto(fooDao.get(id));
	}


}
