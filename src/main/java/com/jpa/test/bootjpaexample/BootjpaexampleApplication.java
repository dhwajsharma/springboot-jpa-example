package com.jpa.test.bootjpaexample;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
//		User user = new User();
//		user.setName("Dhwaj Sharma");
//		user.setCity("Jaipur");
//		user.setStatus("sheesh");
//
//		User user1 = userRepository.save(user);
//
//		System.out.println(user1);
		
		// create object of user
//		User user1 = new User();
//		user1.setName("Astitva");
//		user1.setCity("jaipur");
//		user1.setStatus("busy");
//
//		User user2 = new User();
//		user2.setName("Apporv");
//		user2.setCity("delhi");
//		user2.setStatus("available");
		
		// saving single user
//		User resultUser = userRepository.save(user2);

//		ArrayList<User> users = new ArrayList<User>();
//		users.add(user1);
//		users.add(user2);
//		Iterable<User> result = userRepository.saveAll(users);
//
//		result.forEach(user -> {
//			System.out.println(user);
//		});
//
////		System.out.println("saved user " + result);
//		System.out.println("done");

		// updating user
//		Optional<User> optional = userRepository.findById(3);
//		User user = optional.get();
//
//		user.setName("Ankit");
//		User result = userRepository.save(user);
//
//		System.out.println(result);

		// get user
		// findById(id)
//		Iterable<User> itr = userRepository.findAll();
//
//		itr.forEach(user -> {
//			System.out.println(user);
//		});

		// delete user
//		userRepository.deleteById(3);
//		findAll

//		List<User> users = userRepository.findByNameStartingWith("A");
//		users.forEach(user -> System.out.println(user));

//		List<User> allUser = userRepository.getAllUser();
//		allUser.forEach(user -> System.out.println(user));

//		List<User> userByName = userRepository.getUserByName("Apporv");
//		userByName.forEach(user -> System.out.println(user));

		List<User> users = userRepository.getUsers();
		users.forEach(user -> System.out.println(user));

	}

}
