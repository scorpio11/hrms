package hrms.kodlamaio.core.concretes;

import hrms.kodlamaio.core.abstracts.MernisCheckService;
import hrms.kodlamaio.entities.concretes.JobSeeker;

public class MernisManager implements MernisCheckService {
    @Override
    public boolean checkIfRealPerson(JobSeeker jobSeeker) {
        return true;
    }
}
