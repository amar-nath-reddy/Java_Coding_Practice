package org.example.streams.intermediate;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Cat","cow","Batman","Ravi","Amar","iron");

        System.out.println(names.stream()
                .collect(Collectors.groupingBy(String::length)));

        //by defult it will take a list of maps
        // another way
        Map<Integer,List<String>> gorupingNameswithLenth =names.stream()
                .collect(Collectors.groupingBy(s->s.length()));
        System.out.println("gorupingNameswithLenth:"+gorupingNameswithLenth);



        List<Employee> employees = Arrays.asList(
                new Employee(1,"John", "HR", 50000),
                new Employee(2,"Jane", "IT", 70000),
                new Employee(3,"Mike", "IT", 80000),
                new Employee(4,"Sara", "Finance", 60000),
                new Employee(5,"Paul", "HR", 55000),
                new Employee(6,"Ravi", "HR", 58000)

        );

        System.out.println("" + "");
        //geting Avg Sal by Each Deptment
        Map<String, Double> avgsalbydep = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                                               Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("avgsalbydep::" + avgsalbydep);
        System.out.println(" ");

        Map<String, Optional<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        Map<String, Long> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                                               Collectors.counting()));

        System.out.println("Countof emp in dep:"+collect1);
        System.out.println(" ");
        //now i want to get the dep who have emp count more that 2
        //for that we stream the Map(collect1)

        List<Map.Entry<String, Long>> entries = collect1.entrySet().stream()
                .filter(dep -> dep.getValue() > 2)
                .toList();

        System.out.println("get the dep who have emp count more that 2:"+entries);
        ;
        List<String> entries1 = collect1.entrySet().stream()
                .filter(dep -> dep.getValue() > 2)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Getting only Dep count more than Two :: "+entries1);

        // Here i am Going to merge after groupgBy on map again perfoming action to getcount on map

        List<String> groupingdepbymap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                                               Collectors.counting()))
                .entrySet().stream()
                .filter(dep -> dep.getValue() > 2)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("Here we are perfoming action " +
                                   "like we are Getting the Count of emp in dep whoes emp count is > 2 in a dep" +
                                   "so for the we used Group by there we stored the data \n in map" +
                                   "<Grp of Dep , count >"+"Its Look Like Map<String,Int> this map having the count of " +
                                   "emp in ech deo ...... Now we need to perfome anthoer action to exract\n the emp who has a count > 2 " +
                                   "for that we itreate the Map serparatly or we can comdine the the map after groping by " +
                                   "by using  \n .entrySet().stream()  after .collect");

        System.out.println("Geting count > 2 ::"+groupingdepbymap);
    }
}