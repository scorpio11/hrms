package hrms.kodlamaio.core.abstracts;

import hrms.kodlamaio.entities.concretes.JobSeeker;

public interface MernisCheckService {
    public boolean checkIfRealPerson(JobSeeker jobSeeker);
}
