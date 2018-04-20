package com.design.pattern.filterpattern.criterias;

import com.design.pattern.filterpattern.Criteria;
import com.design.pattern.filterpattern.Driver;

import java.util.List;

public class CriteriaAnd implements Criteria{

    private Criteria a;
    private Criteria b;
    private CriteriaAnd(){
    }
    public CriteriaAnd(Criteria a,Criteria b){
        this.a = a;
        this.b = b;
    }
    @Override
    public List<Driver> meetCriteria(List<Driver> drivers) {
        System.out.println(String.format("Criteria Constraint : Both : %s and %s ",a.toString(),b.toString()));
        List<Driver> firstCriteriaDrivers = a.meetCriteria(drivers);
        return b.meetCriteria(firstCriteriaDrivers);
    }
}
