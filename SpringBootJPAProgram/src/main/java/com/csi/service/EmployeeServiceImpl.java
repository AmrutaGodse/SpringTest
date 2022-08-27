package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDaoimpl;

    public Employee saveData(Employee employee)
    {
        return employeeDaoimpl.saveData(employee);
    }

    public List<Employee> getAllData()
    {
        return employeeDaoimpl.getAllData();
    }

    public Employee updateData(Employee employee)
    {
        return employeeDaoimpl.updateData(employee);
    }

    public void deleteData(int empId)
    {
        employeeDaoimpl.deleteData(empId);
    }

    public List<Employee> getByName(String firstName)
    {
        return employeeDaoimpl.getByName(firstName);
    }
}
