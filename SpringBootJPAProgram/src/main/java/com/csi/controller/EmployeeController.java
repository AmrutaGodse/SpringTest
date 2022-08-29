package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping("/savedata")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee)
    {
        log.info("**********Trying To Save Data for Employee:"+employee.getFirstName());
        return ResponseEntity.ok(employeeService.saveData(employee));
    }

    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>> getAllData()
    {
        return ResponseEntity.ok(employeeService.getAllData());
    }

    @PutMapping("/updatedata/{empId}")
    public ResponseEntity<Employee> updateData(@PathVariable int empId,@RequestBody Employee employee)
    {
        //Exception Code Goes Here.....

        return ResponseEntity.ok(employeeService.updateData(employee));
    }

    @DeleteMapping("/deletedata/{empId}")
    public ResponseEntity<String> deleteData(@PathVariable int empId)
    {
        employeeService.deleteData(empId);
        return ResponseEntity.ok("Data Deleted Successfully");
    }

    @GetMapping("getdatabyname/{firstName}")
    public ResponseEntity<List<Employee>> getByName(@PathVariable String firstName)
    {
        return ResponseEntity.ok(employeeService.getByName(firstName));
    }

    @GetMapping
    public String sayHello()
    {
        return "Welcome To Conganizant";
    }

    //Created API 
    @GetMapping("/hii")
    public String sayHii()
    {
        return "Welcome To Conganizant Pune";
    }


    @GetMapping("/hello")
    public ResponseEntity<String> sayHEllo()
    {
        return ResponseEntity.ok("Welcom bhai lok");
    }



}
