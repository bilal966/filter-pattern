package com.design.pattern.filterpattern;


import java.util.List;

public interface Criteria {

    public List<Driver> meetCriteria(List<Driver> drivers);
}
