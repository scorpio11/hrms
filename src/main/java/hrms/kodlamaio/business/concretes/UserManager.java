package hrms.kodlamaio.business.concretes;

import hrms.kodlamaio.business.abstracts.UserService;
import hrms.kodlamaio.core.utilities.results.DataResult;
import hrms.kodlamaio.core.utilities.results.Result;
import hrms.kodlamaio.core.utilities.results.SuccessDataResult;
import hrms.kodlamaio.dataAccess.abstracts.UserDao;
import hrms.kodlamaio.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserManager implements UserService {
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public DataResult<List<User>> getAll() {

        return  new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data listelendi");

    }

    @Override
    public Result addUserAccount(User user) {

        return null;
    }

    @Override
    public boolean addVerificationEmail(User user) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean signUp(User user) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public User getUser(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return null;
    }

    @Override
    public DataResult<User> getUserByEmail(String email) {
        return  new SuccessDataResult<User>(this.userDao.findUserByEmail(email));
    }
}
