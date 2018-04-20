package com.design.pattern.filterpattern.criterias;

import com.design.pattern.filterpattern.Criteria;
import com.design.pattern.filterpattern.Driver;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaOr implements Criteria {

    private Criteria a;
    private Criteria b;
    private CriteriaOr(){

    }
    public CriteriaOr(Criteria a,Criteria b){
        this.a = a;
        this.b = b;
    }

    @Override
    public List<Driver> meetCriteria(List<Driver> drivers) {
        System.out.println(String.format("Criteria Constraint : OR : %s or %s ",a.toString(),b.toString()));
        List<Driver> aCriteriaDrivers = a.meetCriteria(drivers);
        List<Driver> bCriteriaDrivers = b.meetCriteria(drivers);
        bCriteriaDrivers.forEach(driver -> {
          if(!aCriteriaDrivers.contains(driver))
              aCriteriaDrivers.add(driver);
        });

        return aCriteriaDrivers;
    }
}
