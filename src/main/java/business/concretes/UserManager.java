package business.concretes;

import business.abstracts.UserService;
import core.dataaccess.UserDao;
import core.entities.User;
import core.result.Result;
import core.result.SuccessResult;
import dataAccess.abstracts.ProductsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager (UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("User added");
    }
}
