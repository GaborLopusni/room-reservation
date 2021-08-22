package com.glopusni.lil.sbet.landon.roomreservation.controllers;

import com.glopusni.lil.sbet.landon.roomreservation.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
public class EmployeeController {  
    
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String getStaff(Model model){
        model.addAttribute("staff", employeeService.getStaff());
        return "staff";
    }
}
