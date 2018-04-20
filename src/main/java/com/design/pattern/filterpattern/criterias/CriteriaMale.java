package com.design.pattern.filterpattern.criterias;

import com.design.pattern.filterpattern.Criteria;
import com.design.pattern.filterpattern.Driver;
import com.design.pattern.filterpattern.util.Gender;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaMale implements Criteria {

    /**
     *
     * @param drivers list of all registered drivers.
     * @return filtered list of male drivers.
     */
    @Override
    public List<Driver> meetCriteria(List<Driver> drivers) {
        System.out.println("Criteria Gender: Male");
        List<Driver> maleDrivers;
        maleDrivers = drivers.parallelStream()
                .filter( driver -> (driver.getGender().equalsIgnoreCase(Gender.MALE.name())))
                .collect(Collectors.toList());
        return maleDrivers;
    }
}
