package cl.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.base.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String>{
	public Company findByName(String name);
}
