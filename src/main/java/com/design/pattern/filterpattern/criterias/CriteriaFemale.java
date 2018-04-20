package com.design.pattern.filterpattern.criterias;


import com.design.pattern.filterpattern.Criteria;
import com.design.pattern.filterpattern.Driver;
import com.design.pattern.filterpattern.util.Gender;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muhammad
 */
public class CriteriaFemale implements Criteria{


    /**
     * @param drivers list of all registered drivers
     * @return list of femaleDrivers that matched the criteria.
     */
    @Override
    public List<Driver> meetCriteria(List<Driver> drivers) {
        System.out.println("Criteria Gender: Female");
        List<Driver> femaleDrivers = new ArrayList<>();
        drivers.stream().forEach(driver -> {
            if(driver.getGender().equalsIgnoreCase(Gender.FEMALE.name())){
                femaleDrivers.add(driver);
            }
        });
        return femaleDrivers;
    }
}
