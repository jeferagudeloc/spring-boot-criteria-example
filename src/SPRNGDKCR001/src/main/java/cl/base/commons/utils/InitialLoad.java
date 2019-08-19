package cl.base.commons.utils;

import java.time.ZonedDateTime;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.base.commons.utils.load.CompanyLoad;
import cl.base.commons.utils.load.EmployeeLoad;
import cl.base.commons.utils.load.ProfileLoad;
import cl.base.model.Company;
import cl.base.repository.CompanyRepository;
import cl.base.repository.EmployeeRepository;
import cl.base.repository.ProfileRepository;

@Component
public class InitialLoad {
	@Autowired
	private EmployeeLoad employeeLoad;

	@Autowired
	private CompanyLoad companyLoad;

	@Autowired
	private ProfileLoad profileLoad;

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ProfileRepository profileRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
 
	@PostConstruct
	public void init() {
		
		if (employeeRepository.findAll().isEmpty()) {
			
			System.out.println("alksjjalsf");

			companyLoad.createCompany("Company 1", "Adress 1");
			companyLoad.createCompany("Company 2", "Adress 2");
			companyLoad.createCompany("Company 3", "Adress 3");

			profileLoad.createProfile("Profile 1", true);
			profileLoad.createProfile("Profile 2", true);
			profileLoad.createProfile("Profile 3", false);

			employeeLoad.createEmployee(15, companyRepository.findByName("Company 1"), "jesus.vicente@company.cl", true, ZonedDateTime.now().minusDays(25),
					"Jesus Vicente", "Paredes Guzman", profileRepository.findByName("Profile 2"), "26222321-3", 350000);
			employeeLoad.createEmployee(33, companyRepository.findByName("Company 3"), "juan.felipe@company.cl", true, ZonedDateTime.now().minusDays(45),
					"Juan Felipe", "Escobar Perez", profileRepository.findByName("Profile 2"), "26222321-1", 350000);
			employeeLoad.createEmployee(22, companyRepository.findByName("Company 2"), "carlos.julio@company.cl", true, ZonedDateTime.now().minusDays(65),
					"Carlos Julio", "Chavez Morel", profileRepository.findByName("Profile 3"), "26222321-4", 350000);
			employeeLoad.createEmployee(52, companyRepository.findByName("Company 3"), "carlos.javier@company.cl", true, ZonedDateTime.now().minusDays(85),
					"Carlos Javier", "Diaz Moreno", profileRepository.findByName("Profile 3"), "26222321-6", 350000);
			employeeLoad.createEmployee(45, companyRepository.findByName("Company 2"), "maria.alejandra@company.cl", true, ZonedDateTime.now().minusDays(105),
					"Maria Alejandra", "Hidalgo Sandoval", profileRepository.findByName("Profile 2"), "26222321-7", 350000);

		}
	}

}
