package hrms.kodlamaio.business.abstracts;

import hrms.kodlamaio.core.utilities.results.Result;
import hrms.kodlamaio.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {

    public Result add(Employer employer);

    public Result update(Employer employer);

    public Result delete(Employer employer);

    public List<Employer> getAll();
}
