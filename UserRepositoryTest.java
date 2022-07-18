//package com.abc.demo.dao;
//
//import static org.junit.jupiter.api.Assertions.*;
//import java.util.Optional;
//import com.abc.demo.dao.*;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.abc.demo.dto.UserDTO;
//
//
//class UserRepositoryTest {
//	@Autowired
//	UserRepository userRepo;
//	
//	@Before
//	public void init() {
//		UserDTO user = new UserDTO();
//		user.setId(123);
//		user.setLogin("demo@uw.edu");
//		user.setPassword("demo@123");
//	}
//
//	@Test
//	public void whenfindByLogin() {
//		
//		UserDTO userOpt  = userRepo.findByLogin("demo");
//		System.out.println(userOpt);
//		userOpt.getId();
//		userOpt.getLogin();
//		userOpt.getPassword();	
//		
//	
//			//assertEquals(userOpt).isNotNull();
//			assertEquals(userOpt.getId(), 123);
//			assertEquals(userOpt.getLogin(), "demo@uw.edu");
//			assertEquals(userOpt.getPassword(), "demo@123");
//			
//		}
//
//}
