package firebaseDemo.firebaseDemo.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import firebaseDemo.firebaseDemo.model.User;
import firebaseDemo.firebaseDemo.repository.UserRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/usersController")
public class UsersController {
	
	private UserRepository userRepository;

	
	@Autowired
	public UsersController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/getAllUsers")
	private Flux<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/saveUser")
	private Mono<User> saveUser(@RequestBody @Valid User user){
		return this.userRepository.save(user);
	}
	

	
	
}
