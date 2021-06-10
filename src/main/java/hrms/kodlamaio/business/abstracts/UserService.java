package hrms.kodlamaio.business.abstracts;

import hrms.kodlamaio.core.utilities.results.DataResult;
import hrms.kodlamaio.core.utilities.results.Result;
import hrms.kodlamaio.entities.concretes.User;

import java.util.List;

public interface UserService {
    Result addUserAccount(User user);
    boolean addVerificationEmail(User user);
    boolean signUp(User user);

    User getUser(int id);

    DataResult<List<User>> getAll();

    Result add(User user);
    DataResult<User> getUserByEmail(String email);
}
