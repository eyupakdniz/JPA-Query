package com.eyup.jpaquery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eyup.jpaquery.entities.User;
import com.eyup.jpaquery.repository.UserRepository;

@SpringBootApplication
public class JpaqueryApplication  implements CommandLineRunner{
	
	private UserRepository userRepository;
	

	public JpaqueryApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaqueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user0 = new User("ali","kaya","alikaya@gmail.com","001");
		userRepository.save(user0);
		
		User user1 = new User("osman","yılmaz","osmanyilmaz@gmail.com","002");
		userRepository.save(user1);
		
		User user2 = new User("veli","çoşkun","velicoskun@gmail.com","003");
		userRepository.save(user2);
		
		User user3 = new User("alp","esen","alpesen@gmail.com","004");
		userRepository.save(user3);
		
		User user4 = new User("ali","uzun","aliuzun@gmail.com","005");
		userRepository.save(user4);
		
		
	}

}
