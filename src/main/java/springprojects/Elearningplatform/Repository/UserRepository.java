package springprojects.Elearningplatform.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springprojects.Elearningplatform.User.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
