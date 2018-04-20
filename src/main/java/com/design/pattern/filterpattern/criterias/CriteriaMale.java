package com.design.pattern.filterpattern.criterias;

import com.design.pattern.filterpattern.Criteria;
import com.design.pattern.filterpattern.Driver;

import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Driver> meetCriteria(List<Driver> drivers) {
        System.out.println("Criteria Gender: Male");

        return null;
    }
}
