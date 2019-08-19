package cl.base.service;

import java.util.List;

import cl.base.controller.ObjectFilter;
import cl.base.model.Employee;


public interface ConstructService {
	public List<Employee> construct(ObjectFilter u); 
}
