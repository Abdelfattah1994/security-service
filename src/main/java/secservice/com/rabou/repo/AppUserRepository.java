package secservice.com.rabou.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import secservice.com.rabou.entities.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	AppUser findByUsername(String username);
}
