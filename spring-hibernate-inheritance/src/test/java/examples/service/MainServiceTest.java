package examples.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import examples.model.B;
import examples.model.C;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
@Transactional
public class MainServiceTest {
	
	@Autowired
	private MainService mainService;
	
	@Test
	public void test() {
		List<B> bList = mainService.getAllB();
		List<C> cList = mainService.getAllC();
		
		for (B b : bList) {
			System.out.println(b.getId() + " " + b.getDescription());
		}
		
		for (C c : cList) {
			System.out.println(c.getId() + " " + c.getDescription());
		}
	}

}
