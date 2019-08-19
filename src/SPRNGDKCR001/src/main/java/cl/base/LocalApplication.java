package cl.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 
 * @author: jeferson 
 */
@Configuration
@EnableAutoConfiguration
@EnableScheduling 
@ComponentScan
public class LocalApplication {
 
	private static final Logger LOGGER = LoggerFactory.getLogger(LocalApplication.class);

	public static void main(String[] args) {
		LOGGER.info("*************************************");
		LOGGER.info("*******INICIANDO LA APLICACION*******"); 
		LOGGER.info("*************************************"); 
		SpringApplication.run(LocalApplication.class, args); 
	} 

}