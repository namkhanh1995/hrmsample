package training.hrm.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import training.hrm.entity.Employee;
import training.hrm.repository.EmployeeRepository;

@CrossOrigin(origins="http://localhost:4200")  
@RestController
public class EmployeeAPI {
	@Autowired
    private EmployeeRepository employeeRepository;
	
	@GetMapping("/api/test")
    public ResponseEntity<String> testSpringBoot() {
        return ResponseEntity.ok("Success");
    }
	
    @GetMapping("/api/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
