package com.design.pattern.filterpattern;

public class Driver {

    private final String name;
    private final int age;
    private final String gender;
    private final String maritalStatus;

    private Driver(String name,int age,String gender,String maritalStatus){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }
    public String getMaritalStatus(){
        return this.maritalStatus;
    }

    @Override
    public String toString() {
        return String.format("Driver:{name:%s,age:%d,gender:%s,maritalStatus:%s}",name,age,gender,maritalStatus);
    }

    public static Builder builder(){
        return new Builder();
    }

    public static final class Builder{

        private String name;
        private int age;
        private String gender;
        private String maritalStatus;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setAge(int age){
            this.age = age;
            return this;
        }
        public Builder setGender(String gender){
            this.gender = gender;
            return this;
        }
        public Builder setMaritalStatus(String maritalStatus){
            this.maritalStatus = maritalStatus;
            return this;
        }

        public Driver build(){
            return new Driver(name,age,gender,maritalStatus);
        }

        private Builder(){

        }

    }
}
