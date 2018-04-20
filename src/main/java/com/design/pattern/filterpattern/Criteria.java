package com.design.pattern.filterpattern;


import java.util.List;

public interface Criteria {

    /**
     *
     * @param drivers
     * @return fitlerd list of drivers that match the criteria.
     */
     List<Driver> meetCriteria(List<Driver> drivers);
}
