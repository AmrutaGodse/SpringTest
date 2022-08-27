package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepository employeerepositoryimpl;

    public Employee saveData(Employee employee)
    {
        return employeerepositoryimpl.save(employee);
    }

    public List<Employee> getAllData()
    {
        return employeerepositoryimpl.findAll();
    }

    public Employee updateData(Employee employee)
    {
        return employeerepositoryimpl.save(employee);
    }

    public void deleteData(int empId)
    {
        employeerepositoryimpl.deleteById(empId);
    }

    public List<Employee> getByName(String firstName)
    {
        return employeerepositoryimpl.findByfirstName(firstName);
    }
}
