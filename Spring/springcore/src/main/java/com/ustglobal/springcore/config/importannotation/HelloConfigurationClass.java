package com.ustglobal.springcore.config.importannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

@Configuration
@Import(PetConfigurartionClass.class)
public class HelloConfigurationClass {

	@Bean(name = "hello")
	/* @Scope("prototype") */
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("Welcome to spring using annotation");
		return hello;
	}
	
	
}
