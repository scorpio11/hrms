package hrms.kodlamaio.business.abstracts;

import hrms.kodlamaio.core.utilities.results.DataResult;
import hrms.kodlamaio.core.utilities.results.Result;
import hrms.kodlamaio.entities.concretes.SystemPersonnel;

import java.util.List;

public interface SystemPersonnelService {
    public Result register(SystemPersonnel systemPersonnel);
    public DataResult<List<SystemPersonnel>> getAll();
}
