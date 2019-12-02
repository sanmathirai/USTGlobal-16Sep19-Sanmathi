package com.ustglobal.springcore.config.importannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Pet;

@Configuration
public class PetConfigurartionClass {
	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean(name = "cat")
	public Cat getCat() {
		return new Cat();
	}
	@Bean(name = "pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Pinky");
		
		/*
		 * pet.setAnimal(getDog());//wiring
		 */		return pet;
	}
	
}
