package hrms.kodlamaio.dataAccess.abstracts;

import hrms.kodlamaio.entities.concretes.ConfirmBySystemEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfirmBySystemEmployeeDao extends JpaRepository<ConfirmBySystemEmployee,Integer> {
}
