package hrms.kodlamaio.business.concretes;

import hrms.kodlamaio.business.abstracts.JobTitleService;
import hrms.kodlamaio.dataAccess.abstracts.JobTitleDao;
import hrms.kodlamaio.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {
    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        super();
        this.jobTitleDao = jobTitleDao;
    }


    @Override
    public List<JobTitle> getAll(){
        return jobTitleDao.findAll();
    }
}
