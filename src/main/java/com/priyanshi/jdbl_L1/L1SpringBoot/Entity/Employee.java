package com.priyanshi.jdbl_L1.L1SpringBoot.Entity;

public class Employee {

    public int id;
    public String name;
    public int sal;
    public String dept;


    public Employee(int id, String name, int sal, String dept) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", dept='" + dept + '\'' +
                '}';
    }

    //It has to do with the Spring
    public Employee(){
        super();
    }
}
