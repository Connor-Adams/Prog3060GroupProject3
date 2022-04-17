package com.prog3060.prog3060groupproject3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("HRService")
public class HRManagerService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;


    public void test() {
        System.out.println("i work");

        //All employees with salary in range of 9000,17000
        Iterable<EmployeesEntity> allEmployees = employeeRepository.findAll();
        for (EmployeesEntity currentEmp : allEmployees) {
            if(17000 >= currentEmp.getSalary() && currentEmp.getSalary() <= 9000){
                System.out.println(currentEmp);
            }
        }

        //All employees whose first name ends in 'a'.
        List<EmployeesEntity> aEmployees = employeeRepository.findByFirstNameEndingWith("a");
        aEmployees.forEach(emp -> System.out.println(emp));
        //All employees working in accounting
        //All employees withing under manager 108
        List<EmployeesEntity> employeesManagedBy108 = employeeRepository.findByManagerId(108L);
        employeesManagedBy108.forEach(employeesEntity -> System.out.println(employeesEntity));

        //All departments with Location ID 1700
        List<DepartmentsEntity> departmentLocation1700 =  departmentRepository.findByLocationId(1700L);
        departmentLocation1700.forEach(departmentsEntity -> System.out.println(departmentsEntity));

        //Count of cities each country has - return country id and number of cities
        //Department name, city and province/state for each department
        //display last name, job, dept number and dept name for all employees who work in Toronto
        //Display average sum of salaries and group results with department id
        //select the manager name, department id of manager, and the count of employees working under the manager as total_employees



    }

}
