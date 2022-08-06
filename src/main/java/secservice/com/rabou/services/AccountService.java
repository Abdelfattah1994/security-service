package secservice.com.rabou.services;

import java.util.List;

import secservice.com.rabou.entities.AppRole;
import secservice.com.rabou.entities.AppUser;

public interface AccountService {
	AppUser addNewUser(AppUser appUser);
	AppRole addNewRole(AppRole appRole);
	AppUser loadUserByUsername(String username);
	void addRoleToUser(String username, String rolename);
	List<AppUser> listUsers();
}
