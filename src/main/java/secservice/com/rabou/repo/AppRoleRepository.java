package secservice.com.rabou.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import secservice.com.rabou.entities.AppRole;

public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
	AppRole findByRoleName(String roleName);
}
