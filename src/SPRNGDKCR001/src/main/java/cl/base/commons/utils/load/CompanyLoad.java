package cl.base.commons.utils.load;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.base.model.Company;
import cl.base.repository.CompanyRepository;

@Service
public class CompanyLoad {
	
	@Autowired
	private CompanyRepository compnayRepository;

	public void createCompany(String name, String address){
		Company c = new Company();
		c.setName(name);
		c.setAddress(address);
		compnayRepository.save(c);
	}
}
