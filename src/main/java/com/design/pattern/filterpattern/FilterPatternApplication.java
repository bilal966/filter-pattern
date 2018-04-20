package com.design.pattern.filterpattern;

import com.design.pattern.filterpattern.util.Gender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilterPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilterPatternApplication.class, args);
		System.out.println("Starting Spring-Boot Application: Filter Design Pattern...!");
		Driver driverBilal = Driver.builder().setName("Bilal").setAge(20).setGender(Gender.MALE.name()).build();
        Driver driverJhon = Driver.builder().setName("Jhon").setAge(20).setGender(Gender.MALE.name()).build();
        Driver driverSmith = Driver.builder().setName("Smith").setAge(20).setGender(Gender.MALE.name()).build();
	}
}
