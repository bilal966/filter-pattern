package com.design.pattern.filterpattern.criterias;

import com.design.pattern.filterpattern.Criteria;
import com.design.pattern.filterpattern.Driver;
import com.design.pattern.filterpattern.exception.FailedCriteriaException;
import com.design.pattern.filterpattern.util.MaritalStatus;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Driver> meetCriteria(List<Driver> drivers) {
        System.out.println("Criteria Marital Status: Single");
        List<Driver> singleDrivers;
        try {
            singleDrivers = drivers.parallelStream()
                    .filter(driver -> (driver.getMaritalStatus().equalsIgnoreCase(MaritalStatus.SINGLE.name())))
                    .collect(Collectors.toList());
        }catch (NullPointerException e){
            throw new FailedCriteriaException("Failed Single Criteria, Registered driver has missing some data.");
        }
        return singleDrivers;
    }

    @Override
    public String toString() {
        return "Criteria Single";
    }
}
