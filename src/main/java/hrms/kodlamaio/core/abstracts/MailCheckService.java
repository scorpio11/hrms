package hrms.kodlamaio.core.abstracts;

import org.springframework.stereotype.Service;


public interface MailCheckService {
    public boolean mailCheck(String email);
}
