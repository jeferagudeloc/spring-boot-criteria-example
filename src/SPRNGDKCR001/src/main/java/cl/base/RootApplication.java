package cl.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.WebApplicationInitializer;

/**
 * 
 * @author: jeferson
 */
@SpringBootApplication
public class RootApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RootApplication.class);
	} 

	@Bean(name = "configFiles")
	public List<String> getConfigFiles() {
		List<String> configFiles = new ArrayList<String>();
		//configFiles.add(RootApplication.PROPERTIES_VISOR_BOLETA_PATH);
		//configFiles.add(RootApplication.PROPERTIES_VISOR_BOLETA_ELECTRONICA_PATH);
		return configFiles;
	}

}