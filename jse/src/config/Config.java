package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import repository.FooRepository;
import repository.FooRepositoryImpl;
import service.FooService;
import service.FooServiceImpl;

@Configuration
@ComponentScan
public class Config {
	
	@Bean
	public FooService fooService() {
		return new FooServiceImpl();
	}
	
	@Bean
	public FooRepository fooRepository() {
		return new FooRepositoryImpl();
	}
	
}
