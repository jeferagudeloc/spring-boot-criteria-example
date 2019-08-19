package cl.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.base.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

	
	
}
