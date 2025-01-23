package com.prashant.app;

public class Employee {
    private String name;
    private int age;
    private String company;
    private String id;
    private int salary;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Employee(String name, int age , String company, String id, int salary){
        this.name = name;
        this.age = age;
        this.company=company;
        this.id = id;
        this.salary=salary;
    }
    public Employee(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", company='" + company + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }
}
