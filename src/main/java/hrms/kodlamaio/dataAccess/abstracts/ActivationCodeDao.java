package hrms.kodlamaio.dataAccess.abstracts;

import hrms.kodlamaio.entities.concretes.ActivationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivationCodeDao extends JpaRepository<ActivationCode,Integer> {
}
