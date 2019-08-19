package cl.base.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.base.model.Employee;
import cl.base.service.ConstructService;

@RestController
@RequestMapping(value="/generate")
public class ConstructController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConstructController.class);
	 
	@Autowired
	ConstructService constructService;
	
	
	@PostMapping(value="/listEmployee")
	public List<Employee> saveUser(@RequestBody ObjectFilter u){
		return constructService.construct(u);
	}
}
