package org.example.streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEmpBysal {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John", "HR", 50000),
                new Employee(2,"Jane", "IT", 70000),
                new Employee(3,"Mike", "IT", 80000),
                new Employee(4,"Sara", "Finance", 60000),
                new Employee(5,"Paul", "HR", 55000)
        );

        System.out.println("sorting only sal :: "+employees.stream()
                .map(Employee::getSalary )// Here i am trying to Only Sal from this Object
                        .sorted()
                .collect(Collectors.toList()));
        System.out.println("  ");
        System.out.println("Using comparitor sorting sal whole obj :"+employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))// Here i am trying to Get Obj  from  Object
                .collect(Collectors.toList()));


        System.out.println("" +
                "");
        //geting Avg Sal by Each Deptment
        Map<String,Double> avgsalbydep =employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("avgsalbydep::"+avgsalbydep);





    }
}
