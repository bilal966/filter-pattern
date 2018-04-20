package com.design.pattern.filterpattern.criterias;

import com.design.pattern.filterpattern.Criteria;
import com.design.pattern.filterpattern.Driver;
import com.design.pattern.filterpattern.exception.FailedCriteriaException;
import com.design.pattern.filterpattern.util.Gender;
import com.design.pattern.filterpattern.util.MaritalStatus;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaMarried implements Criteria{

    @Override
    public List<Driver> meetCriteria(List<Driver> drivers) {
        System.out.println("Criteria Marital Status: Married");
        List<Driver> marriedDrivers;
        try {
            marriedDrivers = drivers.parallelStream()
                    .filter(driver -> (driver.getMaritalStatus().equalsIgnoreCase(MaritalStatus.MARRIED.name())))
                    .collect(Collectors.toList());
        }catch (NullPointerException e){
            throw new FailedCriteriaException("Failed Married Criteria, Registered driver has missing some data.");
        }
        return marriedDrivers;
    }

    @Override
    public String toString() {
        return "Criteria Married";
    }
}
