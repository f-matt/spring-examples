package x.y.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import x.y.dao.BarDao;
import x.y.dao.FooDao;
import x.y.model.Bar;
import x.y.model.Foo;
import x.y.model.FooBarDto;

@Service
public class FooServiceImpl implements FooService {

	@Autowired
	private FooDao fooDao;
	
	@Autowired
	private BarDao barDao;
	
	@Transactional(value = "transactionManager")
	public FooBarDto getFoo(int id) {
		Foo foo = fooDao.get(id);
		
		return createDto(foo);
	}
	
	public FooBarDto createDto(Foo foo) {
		
		Bar bar = barDao.get(foo.getId());
				
		FooBarDto fooBarDto = new FooBarDto();
				
		fooBarDto.setId(String.valueOf(foo.getId()));
		fooBarDto.setA(String.valueOf(foo.getA()));
		fooBarDto.setB(String.valueOf(foo.getB()));
		fooBarDto.setC(String.valueOf(bar.getC()));
		fooBarDto.setD(String.valueOf(bar.getD()));
		
		return fooBarDto;		
		
	}
	
	

}
