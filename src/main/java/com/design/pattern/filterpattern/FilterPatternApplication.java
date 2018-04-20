package com.design.pattern.filterpattern;

import com.design.pattern.filterpattern.criterias.CriteriaAnd;
import com.design.pattern.filterpattern.criterias.CriteriaFemale;
import com.design.pattern.filterpattern.criterias.CriteriaMale;
import com.design.pattern.filterpattern.criterias.CriteriaSingle;
import com.design.pattern.filterpattern.exception.FailedCriteriaException;
import com.design.pattern.filterpattern.util.Gender;
import com.design.pattern.filterpattern.util.MaritalStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author muhammad bilal
 * @email bilal.hobnail@gmail.com
 */
@SpringBootApplication
public class FilterPatternApplication {


	public static void main(String[] args) {
		SpringApplication.run(FilterPatternApplication.class, args);
        System.out.println();
		System.out.println("Starting Spring-Boot Application: Filter Design Pattern...!");

		try{

            List<Driver> drivers = new ArrayList<>();

            drivers.add(Driver.builder().setName("Bilal").setAge(20).setGender(Gender.MALE.name()).setMaritalStatus(MaritalStatus.SINGLE.name()).build());
            drivers.add(Driver.builder().setName("Jhon").setAge(20).setGender(Gender.MALE.name()).setMaritalStatus(MaritalStatus.SINGLE.name()).build());
            drivers.add(Driver.builder().setName("Smith").setAge(20).setGender(Gender.MALE.name()).setMaritalStatus(MaritalStatus.MARRIED.name()).build());
            drivers.add(Driver.builder().setName("Nina").setAge(20).setGender(Gender.FEMALE.name()).setMaritalStatus(MaritalStatus.MARRIED.name()).build());

            System.out.println("Total Drivers Pool : "+drivers.size());

            Criteria femaleCriteria = new CriteriaFemale();
            List<Driver> femaleDrivers = femaleCriteria.meetCriteria(drivers);
            System.out.println("Total Female Drivers : "+femaleDrivers.size());
            System.out.println("Female Drivers : "+femaleDrivers.toString());
            System.out.println();


            Criteria maleCriteria = new CriteriaMale();
            List<Driver> maleDrivers = maleCriteria.meetCriteria(drivers);
            System.out.println("Total Male Drivers : "+maleDrivers.size());
            System.out.println("Male Drivers : "+maleDrivers.toString());
            System.out.println();

            Criteria singleCriteria = new CriteriaSingle();
            List<Driver> singleDrivers = singleCriteria.meetCriteria(drivers);
            System.out.println("Total Single Drivers : "+singleDrivers.size());
            System.out.println("Single Drivers : "+singleDrivers.toString());
            System.out.println();

            Criteria andCriteria = new CriteriaAnd(maleCriteria,singleCriteria);
            List<Driver> maleAndSingleDrivers = andCriteria.meetCriteria(drivers);
            System.out.println("Total Male and Single Drivers : "+maleAndSingleDrivers.size());
            System.out.println("Male and Single Drivers : "+maleAndSingleDrivers.toString());
            System.out.println();

        }catch (FailedCriteriaException failedCriteriaMeet){
		    System.out.println(failedCriteriaMeet.getMessage());

        }catch (Exception e){

        }


	}
}
