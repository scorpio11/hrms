package hrms.kodlamaio.dataAccess.abstracts;

import hrms.kodlamaio.entities.concretes.SystemPersonnel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemPersonnelDao extends JpaRepository<SystemPersonnel,Integer> {
}
