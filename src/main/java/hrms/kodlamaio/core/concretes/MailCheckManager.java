package hrms.kodlamaio.core.concretes;

import hrms.kodlamaio.core.abstracts.MailCheckService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MailCheckManager implements MailCheckService {
    @Override
    public boolean mailCheck(String email) {

        return true;
    }
}
