package hrms.kodlamaio.api.controllers;

import hrms.kodlamaio.business.abstracts.UserService;
import hrms.kodlamaio.core.utilities.results.DataResult;
import hrms.kodlamaio.core.utilities.results.Result;
import hrms.kodlamaio.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private UserService userService;


    @Autowired
    public UsersController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping("/getall")
    public DataResult<List<User>> getAll(){
        return this.userService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody User user) {
        return this.userService.add(user);
    }
}
