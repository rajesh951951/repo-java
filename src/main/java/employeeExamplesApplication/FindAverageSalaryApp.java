package main.java.employeeExamplesApplication;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

public class FindAverageSalaryApp {

    public void findAverageSalary(List<Employee> employees) {
        Map<String, Map<String, Double>> map = employees.parallelStream()
                .collect(
                        groupingBy(Employee::getOfficeLocation,
                                groupingBy(Employee::getDesignation,
                                        averagingDouble(Employee::getSalary))
                        )
                );

        for (Map.Entry<String, Map<String, Double>> mapEntry : map.entrySet()) {
            String location = mapEntry.getKey();
            for (Map.Entry<String, Double> innerMapEntry : mapEntry.getValue().entrySet()) {
                System.out.println(location + " --> " + innerMapEntry.getKey() + " --> " + innerMapEntry.getValue());
            }
        }
    }
}
