package hrms.kodlamaio.dataAccess.abstracts;

import hrms.kodlamaio.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {
    JobSeeker findByNationalityNumber(String nationalityNumber);
}
