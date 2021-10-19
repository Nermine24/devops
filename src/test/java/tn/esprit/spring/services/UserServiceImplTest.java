package tn.esprit.spring.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IUserService;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class UserServiceImplTest {
	
	@Autowired
	IUserService us;
	
	@Test
	@Order(1)
	public void testRetrieveAllUsers() {
		List<User> listUsers = us.retrieveAllUsers();
	//	Assertions.assertEquals(0,listUsers.size());
	}
	
	
	@Test
	@Order(2)
	public void testaddUser() throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2015-03-23");
		
		User u = new User("youssef", "jemai", d, Role.TECHNICIEN);
		User userAdded = us .addUser(u);
		
		Assertions.assertEquals(u.getLastName(),userAdded.getLastName());

	    
	}
	
	
	
}
