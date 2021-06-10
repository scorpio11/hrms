package hrms.kodlamaio.api.controllers;

import hrms.kodlamaio.business.abstracts.SystemPersonnelService;
import hrms.kodlamaio.core.utilities.results.DataResult;
import hrms.kodlamaio.core.utilities.results.Result;
import hrms.kodlamaio.entities.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/system-personnels")
public class SystemPersonnelsController {
    private SystemPersonnelService systemPersonnelService;

    @Autowired
    public SystemPersonnelsController(SystemPersonnelService systemPersonnelService) {
        super();
        this.systemPersonnelService= systemPersonnelService;
    }

    public DataResult<List<SystemPersonnel>> getAll(){
        return this.systemPersonnelService.getAll();
    }


    public Result register(@RequestBody SystemPersonnel systemPersonnel) {
        return this.systemPersonnelService.register(systemPersonnel);
    }
}
