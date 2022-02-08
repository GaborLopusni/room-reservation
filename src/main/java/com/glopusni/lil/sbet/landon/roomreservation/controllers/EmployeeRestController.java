package com.glopusni.lil.sbet.landon.roomreservation.controllers;

import com.glopusni.lil.sbet.landon.roomreservation.models.Employee;
import com.glopusni.lil.sbet.landon.roomreservation.services.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getStaff();
    }
}
