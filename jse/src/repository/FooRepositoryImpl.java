package repository;

import org.springframework.stereotype.Repository;

@Repository
public class FooRepositoryImpl implements FooRepository {

	public String salvaFoo() {
		return "foo salvo";
	}

}
