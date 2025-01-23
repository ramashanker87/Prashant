package com.prashant.app;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Employee employee1 = new Employee("Prashant",24,"TCS","T21",100000 );
        Employee employee2 = new Employee("Nitin",25,"Google","G22",110000 );
        Employee employee3 = new Employee("Sunil",20,"TCS","T24",20000 );
        Employee employee4 = new Employee("Sam",45,"TCS","T25",40000 );
        Employee employee5 = new Employee("Ram",37,"Amazon","A30",70000 );
        Employee employee6 = new Employee("Pradee[",56,"Amazon","A33",85000 );

        List<Employee> empList = new ArrayList<>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);
        empList.add(employee6);

        //Employee salary greater than 50k
        List<Employee>  empSalaryGreaterThan50000 = empList.stream()
                        .filter(Employee -> Employee.getSalary()>50000).collect(Collectors.toList());
        System.out.println("--------------------------------------");
        System.out.println("Printing from list empSalaryGreaterThan50000");
        for(Employee emp : empSalaryGreaterThan50000){
            System.out.println(emp);
        }


        //Employee Age less than 30
        List<Employee>  empAgeLessThan30 = empList.stream()
                .filter(Employee -> Employee.getAge()<30).collect(Collectors.toList());
        System.out.println("--------------------------------------");
        System.out.println("Printing from list empAgeLessThan30");
        for(Employee emp : empAgeLessThan30){
            System.out.println(emp);
        }


        Map<String , Employee> empMap = new HashMap<>();
        empMap.put(employee1.getName(), employee1);
        empMap.put(employee2.getName(), employee2);
        empMap.put(employee3.getName(), employee3);
        empMap.put(employee4.getName(), employee4);
        empMap.put(employee5.getName(), employee5);
        empMap.put(employee6.getName(), employee6);

        System.out.println("Printing from map ");
        System.out.println("--------------------------------------");

        // Employee salary greater than 40K
        Map<String, Employee> empSalaryLessThan40K = empMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue().getSalary() < 40000)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("--------------------------------------");
        System.out.println("Printing from map empSalaryLessThan40K");

        empSalaryLessThan40K.forEach((key, value) -> System.out.println(key + " : " + value));

        // Employee salary greater than 40K
        Map<String, Employee> empAgeLessThan25= empMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue().getAge() <25)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("--------------------------------------");
        System.out.println("Printing from map empAgeLessThan25");
        empAgeLessThan25.forEach((key, value) -> System.out.println(key + " : " + value));





    }
}
