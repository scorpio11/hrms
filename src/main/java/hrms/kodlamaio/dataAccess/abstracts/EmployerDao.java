package hrms.kodlamaio.dataAccess.abstracts;

import hrms.kodlamaio.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
}
