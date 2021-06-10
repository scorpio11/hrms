package hrms.kodlamaio.business.abstracts;

import hrms.kodlamaio.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {
    List<JobTitle> getAll();
}
