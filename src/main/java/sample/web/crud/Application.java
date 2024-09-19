package sample.web.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import sample.web.crud.model.User;
import sample.web.crud.repository.UserRepository;

@SpringBootApplication
public class Application {

	@Bean
	public UserRepository userRepository() {
		return new UserRepository();
	}

	@Bean
	public Converter<String, User> userConverter() {
		return new Converter<String, User>() {
			@Override
			public User convert(String id) {
				return userRepository().findUser(Long.valueOf(id));
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
