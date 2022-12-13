package web.Api.Controllers;

import business.abstracts.UserService;
import core.entities.User;
import core.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private UserService userService;
    @Autowired
    public UsersController(UserService userService){
        this.userService=userService;
    }

    public Result add(User user){
       return this.userService.add(user);
    }
}
