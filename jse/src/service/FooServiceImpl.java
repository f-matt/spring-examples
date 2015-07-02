package service;

import model.Foo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.FooRepository;

@Service
public class FooServiceImpl implements FooService {
	
	@Autowired
	private FooRepository fooRepository;

	public String salva(Foo foo) {
		return fooRepository.salvaFoo();
	}

}
