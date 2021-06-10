package hrms.kodlamaio.business.concretes;

import hrms.kodlamaio.business.abstracts.EmployerService;
import hrms.kodlamaio.core.utilities.results.Result;
import hrms.kodlamaio.core.utilities.results.SuccessResult;
import hrms.kodlamaio.dataAccess.abstracts.EmployerDao;
import hrms.kodlamaio.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        super();
        this.employerDao = employerDao;

    }

    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("İşveren Sisteme eklendi");
    }

    @Override
    public Result update(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("İşveren Sistemde güncellendi");
    }

    @Override
    public Result delete(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("İşveren Sistemden silindi!");
    }

    @Override
    public List<Employer> getAll() {
        return employerDao.findAll();
    }
}
