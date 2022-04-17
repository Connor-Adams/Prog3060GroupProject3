package com.prog3060.prog3060groupproject3.service;

import com.prog3060.prog3060groupproject3.model.Departments;
import com.prog3060.prog3060groupproject3.model.Employees;
import com.prog3060.prog3060groupproject3.model.Locations;
import com.prog3060.prog3060groupproject3.repos.DepartmentRepository;
import com.prog3060.prog3060groupproject3.repos.EmployeeRepository;
import com.prog3060.prog3060groupproject3.repos.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("HRService")
public class HRManagerService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private LocationsRepository locationRepository;

    public void test() {
        System.out.println("i work");

        //All employees with salary in range of 9000,17000
        System.out.println("All employees with salary in range of 9000-17000");
        Iterable<Employees> allEmployees = employeeRepository.findAll();
        for (Employees currentEmp : allEmployees) {
            if(17000 >= currentEmp.getSalary() && currentEmp.getSalary() >= 9000){
                System.out.println(currentEmp);
            }
        }

        //All employees whose first name ends in 'a'.
        System.out.println("All employees whose first name ends in 'a'");
        List<Employees> aEmployees = employeeRepository.findDistinctByFirstNameEndingWith("a");
        aEmployees.forEach(emp -> System.out.println(emp));

        //All employees working in accounting
        System.out.println("All employees working in accounting");
        List<Employees> accountingEmployees = employeeRepository.findDistinctByDepartmentId(11L);
        accountingEmployees.forEach(actEmp -> System.out.println(actEmp));

        //All employees withing under manager 108
        System.out.println("All employees working under manager 108");
        List<Employees> employeesManagedBy108 = employeeRepository.findByManagerId(108L);
        employeesManagedBy108.forEach(employeesEntity -> System.out.println(employeesEntity));

        //All departments with Location ID 1700
        System.out.println("All departments with Location ID 1700");
        List<Departments> departmentLocation1700 =  departmentRepository.findByLocationId(1700L);
        departmentLocation1700.forEach(departmentsEntity -> System.out.println(departmentsEntity));

        //Count of cities each country has - return country id and number of cities
        System.out.println("Count of cities each country has - return country id and number of cities");
        List<Locations> cityLocations = locationRepository.countByCityGroupByCountryId();
        System.out.println(cityLocations);


        //Department name, city and province/state for each department
        System.out.println("Department name, city and province/state for each department");
        Iterable<Departments> allDepartments = departmentRepository.findAll();

        //display last name, job, dept number and dept name for all employees who work in Toronto



        //Display average sum of salaries and group results with department id

        //select the manager name, department id of manager, and the count of employees working under the manager as total_employees



    }

}
