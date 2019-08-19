package cl.base.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.base.controller.ObjectFilter;
import cl.base.model.Employee;
import cl.base.service.ConstructService;

@Service
public class ConstructServiceImpl implements ConstructService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConstructServiceImpl.class);

	@Autowired
	private EntityManager em;

	@Override
	public List<Employee> construct(ObjectFilter u) {
		
		LOGGER.info("Generating construct");

		List<Employee> result = null;
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Employee> cr = cb.createQuery(Employee.class);
		Root<Employee> root = cr.from(Employee.class);
		
		
		List<Predicate> predicates = new ArrayList<>();
		
		//ADD YOUR CONDITIONS HERE!
		
		if (predicates.isEmpty()) {
			cr.select(root);
		} else {
			cr.select(root).where(predicates.toArray(new Predicate[predicates.size()]));
		}
		
		result = em.createQuery(cr).getResultList();

		return result;
	}

}
