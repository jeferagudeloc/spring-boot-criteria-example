package cl.base.commons.utils.load;

import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import cl.base.model.Company;
import cl.base.model.Employee;
import cl.base.model.Profile;
import cl.base.repository.EmployeeRepository;

/**
 * @author jeferson
 *
 */

@Service
public class EmployeeLoad {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void createEmployee(int age, Company company, String email, boolean enabled, ZonedDateTime enterDate, String firstname, String lastname, Profile profile, String rut, int sueldo){
		Employee e = new Employee();
		e.setAge(age);
		e.setCompany(company);
		e.setEmail(email);
		e.setEnabled(enabled);
		e.setEnterDate(enterDate);
		e.setFirstname(firstname);
		e.setLastname(lastname);
		e.setProfile(profile);
		e.setRut(rut);
		e.setSueldo(sueldo);
		employeeRepository.save(e);
	};
}
