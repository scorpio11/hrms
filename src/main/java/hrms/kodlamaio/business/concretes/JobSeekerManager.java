package hrms.kodlamaio.business.concretes;

import hrms.kodlamaio.business.abstracts.JobSeekerService;
import hrms.kodlamaio.core.utilities.results.DataResult;
import hrms.kodlamaio.core.utilities.results.Result;
import hrms.kodlamaio.core.utilities.results.SuccessDataResult;
import hrms.kodlamaio.core.utilities.results.SuccessResult;
import hrms.kodlamaio.dataAccess.abstracts.JobSeekerDao;
import hrms.kodlamaio.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {
    private JobSeekerDao jobSeekerDao;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        super();
        this.jobSeekerDao = jobSeekerDao;
    }

    @Override
    public Result add(JobSeeker jobSeeker) {
        this.jobSeekerDao.save(jobSeeker);
        return  new SuccessResult("İş adayı başarılı bir şekilde eklendi.");
    }



    @Override
    public Result update(JobSeeker jobSeeker) {
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult("İş adayı başarılı bir şekilde güncellendi.");
    }

    @Override
    public Result delete(JobSeeker jobSeeker) {
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult("İş adayı başarılı bir sekilde silindi.");
    }


    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll());
    }

    @Override
    public DataResult<JobSeeker> getJobSeekerByNationalityNumber(String nationalityNumber) {
        return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findByNationalityNumber(nationalityNumber));
    }
}
