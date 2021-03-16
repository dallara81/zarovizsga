package hu.nive.ujratervezes.zarovizsga.workhours;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Comparator;
import java.io.*;

public class WorkHours {

    public String minWork(String file) {

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String line;
            while ((line = br.readLine()) != null) {
                getEmployeesFromLines(employees, line);

            }

            employees.sort(Comparator.comparing(Employee::getHours));
            return employees.get(0).getName() + "> " + employees.get(0).getDate();

        }

        catch (IOException ioe) {
            throw new IllegalStateException("I cannot find the file!", ioe);

        }
    }

    private void getEmployeesFromLines(List<Employee> employees, String line) {
        String[] row = line.split(",");
        employees.add(new Employee(row[0],
                Integer.parseInt(row[1]),
                LocalDate.parse(row[2])));

    }
}