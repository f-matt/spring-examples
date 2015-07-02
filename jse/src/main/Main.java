package main;

import model.Foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import service.FooService;
import config.Config;

@Configuration
@ComponentScan
public class Main {
	
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		Foo f = new Foo();
		
		f.setNome("FOO");
		
		ctx = new AnnotationConfigApplicationContext(Config.class);
        FooService fooService = ctx.getBean(FooService.class);
	    System.out.println(fooService.salva(f));
		
	}

}
