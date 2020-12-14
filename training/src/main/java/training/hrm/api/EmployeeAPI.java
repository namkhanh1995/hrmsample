package training.hrm.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @GetMapping("/api/code-employees")
    public Employee getCodeEmployees() {
        return employeeRepository.findTopByOrderByIdDesc();
    }
    
    @GetMapping("/api/employees/{employees_id}")
    public Employee getEmployees(@PathVariable("employees_id") long employees_id) {
        return employeeRepository.findOne(employees_id);
    }
    
    @PostMapping("/api/add-employees")
    public Employee addEmployees(@Valid @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
    
    @PutMapping("/api/update-employees/{employees_id}")
    public void updateEmployees(@RequestBody Employee employee, @PathVariable("employees_id") long employees_id) {
        employeeRepository.delete(employees_id);
    }
  
    @DeleteMapping("/api/delete-employees/{employees_id}")
    public void deleteEmployees(@PathVariable("employees_id") long employees_id) {
        employeeRepository.delete(employees_id);
    }
    
}
