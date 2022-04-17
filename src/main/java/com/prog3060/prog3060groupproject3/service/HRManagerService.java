package com.prog3060.prog3060groupproject3.service;

import com.prog3060.prog3060groupproject3.model.Departments;
import com.prog3060.prog3060groupproject3.model.Employees;
import com.prog3060.prog3060groupproject3.model.Jobs;
import com.prog3060.prog3060groupproject3.model.Locations;
import com.prog3060.prog3060groupproject3.repos.DepartmentRepository;
import com.prog3060.prog3060groupproject3.repos.EmployeeRepository;
import com.prog3060.prog3060groupproject3.repos.JobsRepository;
import com.prog3060.prog3060groupproject3.repos.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("HRService")
public class HRManagerService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private LocationsRepository locationRepository;

    @Autowired
    private JobsRepository jobsRepository;

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



        //Department name, city and province/state for each department
        System.out.println("Department name, city and province/state for each department");
        Iterable<Departments> allDepartments = departmentRepository.findAll();
        for (Departments dep : allDepartments){
            System.out.print(dep.getName() + " ");
            Iterable<Locations> currentLoc = locationRepository.findAllById(dep.getLocationId());
            currentLoc.forEach(loc -> System.out.println(loc.getCountryId() + " " + loc.getProvince()));
        }

        //display last name, job, dept number and dept name for all employees who work in Toronto
        System.out.println("display last name, job, dept number and dept name for all employees who work in Toronto");
        Iterable<Departments> currentDep = departmentRepository.findByLocationId(1800L);
        for (Departments dep : currentDep){
            Iterable<Employees> employees = employeeRepository.findDistinctByDepartmentId(dep.getId());
            for (Employees emp : employees){
                System.out.print(emp.getLastName() + ": ");
                Iterable<Jobs> jobe = jobsRepository.findAllById(emp.getJobId());
                jobe.forEach(job -> System.out.print(job.getJobtitle() + ", "));
                System.out.println(dep.getId() + " " + dep.getName());
            }

        }


        //Display average sum of salaries and group results with department id

        //select the manager name, department id of manager, and the count of employees working under the manager as total_employees



    }

}
