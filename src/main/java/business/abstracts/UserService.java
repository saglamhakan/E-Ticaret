package business.abstracts;

import core.entities.User;
import core.result.DataResult;
import core.result.Result;
import entities.concretes.Products;

public interface UserService {
   public Result add(User user);


}
