package springprojects.Elearningplatform;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springprojects.Elearningplatform.Repository.UserRepository;
import springprojects.Elearningplatform.User.User;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ELearningPlatformApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	public void testCreateUser() {
		User ricardo = new User(
				1,
				"Ricardo",
				"truric@gmail.com",
				"password"
		);
		User daniela = new User(
				1,
				"Daniela",
				"daniseixas@gmail.com",
				"password"
		);
		userRepository.saveAll(List.of(ricardo, daniela));

		List<User> listUsers = userRepository.findAll();

		assertThat(listUsers.size()).isEqualTo(2);
	}
}
