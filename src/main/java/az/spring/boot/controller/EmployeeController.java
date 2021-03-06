package az.spring.boot.controller;


import az.spring.boot.model.Employee;
import az.spring.boot.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


@GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

}