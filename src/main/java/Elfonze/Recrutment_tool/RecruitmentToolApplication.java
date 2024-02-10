package Elfonze.Recrutment_tool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecruitmentToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecruitmentToolApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Starting code");
//		User user = new User();
//		user.setUserName("Vinay");
//		user.setEmail("vinay@12345.com");
//		user.setPassword("Vjs@789456");
//		user.setOrganization("Microsoft");
//		user.setProfile("default.png");
//
//		Role role1 = new Role();
//		role1.setRoleId(11);
//		role1.setRoleName("Super Admin");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUserName());
//	}
}
