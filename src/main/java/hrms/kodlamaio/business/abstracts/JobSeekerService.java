package hrms.kodlamaio.business.abstracts;

import hrms.kodlamaio.core.utilities.results.DataResult;
import hrms.kodlamaio.core.utilities.results.Result;
import hrms.kodlamaio.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    Result add(JobSeeker jobSeeker);
    Result update(JobSeeker jobSeeker);
    Result delete(JobSeeker jobSeeker);

    DataResult<List<JobSeeker>> getAll();
    DataResult<JobSeeker> getJobSeekerByNationalityNumber(String nationalityNumber);
}
