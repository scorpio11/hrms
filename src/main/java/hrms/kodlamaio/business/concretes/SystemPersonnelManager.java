package hrms.kodlamaio.business.concretes;

import hrms.kodlamaio.business.abstracts.SystemPersonnelService;
import hrms.kodlamaio.core.utilities.results.DataResult;
import hrms.kodlamaio.core.utilities.results.Result;
import hrms.kodlamaio.core.utilities.results.SuccessDataResult;
import hrms.kodlamaio.core.utilities.results.SuccessResult;
import hrms.kodlamaio.dataAccess.abstracts.SystemPersonnelDao;
import hrms.kodlamaio.entities.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemPersonnelManager implements SystemPersonnelService {
    private SystemPersonnelDao systemPersonnelDao;

    @Autowired
    public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao) {
        super();
        this.systemPersonnelDao = systemPersonnelDao;
    }

    @Override
    public Result register(SystemPersonnel systemPersonnel) {
        this.systemPersonnelDao.save(systemPersonnel);
        return new SuccessResult("Sistem personeli kayıt oldu");
    }

    @Override
    public DataResult<List<SystemPersonnel>> getAll() {
        return new SuccessDataResult<List<SystemPersonnel>>(this.systemPersonnelDao.findAll());
    }
}
