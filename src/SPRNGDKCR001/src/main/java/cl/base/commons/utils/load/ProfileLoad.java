package cl.base.commons.utils.load;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.base.model.Profile;
import cl.base.repository.ProfileRepository;

@Service
public class ProfileLoad {

	
	@Autowired
	private ProfileRepository profileRepository;

	public void createProfile(String name, boolean enabled){
		Profile p = new Profile();
		p.setName(name);
		p.setEnabled(enabled);;
		profileRepository.save(p);
	}
	
}
