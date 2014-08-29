package x.y.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import x.y.dao.FooDao;
import x.y.model.Foo;
import x.y.model.FooDto;

@Service
@Transactional
public class FooServiceImpl implements FooService {

	@Autowired
	private FooDao fooDao;
	
	@Transactional
	public FooDto getFoo(int id) {
		Foo foo = fooDao.get(id);
		
		FooDto fooDto = new FooDto();
		
		fooDto.setId(String.valueOf(foo.getId()));
		fooDto.setA(String.valueOf(foo.getA()));
		fooDto.setB(String.valueOf(foo.getB()));
		
		
		return fooDto;
	}
	
	

}
