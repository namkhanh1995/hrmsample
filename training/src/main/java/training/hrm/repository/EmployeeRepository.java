package training.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import training.hrm.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	@Query("SELECT e FROM Employee e where e.employee_code=(SELECT max(e1.employee_code) FROM Employee e1)")
	Employee findTopByOrderByIdDesc();

}
