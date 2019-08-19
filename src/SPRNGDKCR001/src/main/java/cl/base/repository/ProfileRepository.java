package cl.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.base.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, String> {
	public Profile findByName(String name);
}
