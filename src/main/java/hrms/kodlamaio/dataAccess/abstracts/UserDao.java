package hrms.kodlamaio.dataAccess.abstracts;

import hrms.kodlamaio.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User findUserByEmail (String email);
}
