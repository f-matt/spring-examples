package x.y.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import x.y.dao.BarDao;
import x.y.model.Bar;
import x.y.model.Foo;
import x.y.model.FooBarDto;

@Service
public class BarServiceImpl implements BarService {

	@Autowired
    private BarDao barDao;

    @Transactional(value="transactionManager2", readOnly=true)
    public FooBarDto createDto(Foo foo) {
        FooBarDto fooBarDto = new FooBarDto();
    
        if (foo != null) {
	    	Bar bar = barDao.get(foo.getId());
	
	        fooBarDto.setId(String.valueOf(foo.getId()));
	        fooBarDto.setA(String.valueOf(foo.getA()));
	        fooBarDto.setB(String.valueOf(foo.getB()));

	        if (bar != null) {
	        	fooBarDto.setC(String.valueOf(bar.getC()));
	        	fooBarDto.setD(String.valueOf(bar.getD()));
	        }
        }

        return fooBarDto;
    }
	
	

}
