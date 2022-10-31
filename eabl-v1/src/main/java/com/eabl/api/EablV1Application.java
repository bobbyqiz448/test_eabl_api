package com.eabl.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EablV1Application {

//  @Autowired	
//  UserRepository userRepository
	
//	@PostConstruct
//	CommandLineRunner saveUsersToDB(){
//
//		List<User> users = List.of(
//				new User("234561","Faith","Mutanu","0714659254","LRT349567",1341),
//				new User("234562","Ken","Joseph","0714659254","LRT349567",2500),
//				new User("234563","Bob","Sirawa","0714659254","LRT349567",9173),
//				new User("234564","Ann","Sibuor","0714659254","LRT349567",1924)
//		);
//		repository.saveAll(users);
//
//		return  null;
//
//	}
	

	public static void main(String[] args) {
		SpringApplication.run(EablV1Application.class, args);
		
		System.out.println("Success!!!;");
		
	}

}
