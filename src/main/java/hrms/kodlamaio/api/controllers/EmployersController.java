package hrms.kodlamaio.api.controllers;

import hrms.kodlamaio.business.abstracts.EmployerService;
import hrms.kodlamaio.core.utilities.results.Result;
import hrms.kodlamaio.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
    private EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {
        super();
        this.employerService = employerService;
    }

    @GetMapping("/getall")
    public List<Employer> getAll() {

        return this.employerService.getAll();
    }

    @PostMapping("/add")
    public Result add(Employer employer) {
        return this.employerService.add(employer);
    }



    @DeleteMapping("/delete")
    public Result delete(@RequestBody Employer employer) {

        return this.employerService.delete(employer);
    }
}
