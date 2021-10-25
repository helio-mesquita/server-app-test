package com.heliomesquita.dev.server.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.heliomesquita.dev.server.entitites.User;
import com.heliomesquita.dev.server.repositories.UserRepository;

@Configuration
@Profile("test")
public class TextConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
		
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User u1 = new User(1L, "Gabriel Lacerda", "gabriel@gmail.com", "988888888", "123456");
		User u2 = new User(2L, "Luiz Otávio", "luiz@gmail.com", "977777777", "123456");
		User u3 = new User(3L, "Klaus", "Klaus@gmail.com", "922222222", "123456");
		User u4 = new User(4L, "Buiú", "buiu@gmail.com", "9111111111", "123456");
		User u5 = new User(5L, "Gabriel Dias", "gabrieldias@gmail.com", "933333333", "123456");
		User u6 = new User(6L, "Bruno Pacheco", "bruno@gmail.com", "944444444", "123456");
		User u7 = new User(7L, "Fernando Sobral", "fernando@gmail.com", "955555555", "123456");
		User u8 = new User(8L, "Marlon", "marlon@gmail.com", "966666666", "123456");
		User u9 = new User(9L, "Vina", "vina@gmail.com", "999999999", "123456");
		User u10 = new User(10L, "Cléber", "cleber@gmail.com", "997979797", "123456");
		User u11 = new User(11L, "André Luiz", "andreluiz@gmail.com", "987878787", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11));
		
	}
	
	
}
