package az.spring.boot.service;


import az.spring.boot.model.Employee;
import az.spring.boot.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final  EmployeeRepository employeeRepository;
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();

    }
}
