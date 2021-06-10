package hrms.kodlamaio.dataAccess.abstracts;

import hrms.kodlamaio.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
}
