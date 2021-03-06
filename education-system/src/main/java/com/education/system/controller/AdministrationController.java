package com.education.system.controller;

import com.education.system.entity.AdminAccount;
import com.education.system.service.AdministrationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/administration")
public class AdministrationController {

    @Autowired
    AdministrationUserService administrationUserService;

    @GetMapping("/queryAccountStatus")
    public Integer queryAccountStatus(Integer administrationId){
       return administrationUserService.queryAccountStatus(administrationId);
    }

    @PostMapping("/queryAccountInfoMatch")
    public boolean queryAccountInfoMatch(@RequestBody AdminAccount adminAccount){
        return administrationUserService.queryAccountInfoMatch(adminAccount);
    }

    @PostMapping("/userLogin")
    public boolean userLogin(@RequestBody AdminAccount adminAccount){
        return administrationUserService.userLogin(adminAccount);
    }

    @PostMapping("/alterAccountInfo")
    public Integer alterAccountInfo(@RequestBody AdminAccount adminAccount){
        return administrationUserService.alterAccountInfo(adminAccount);
    }

    @PostMapping("/createAccount")
    public Integer createAccount(@RequestBody AdminAccount adminAccount){
        return administrationUserService.createAccount(adminAccount);
    }

    @GetMapping("/queryAdministrationInfo")
    public AdminAccount queryAdministrationInfo(Integer administrationId){
        return administrationUserService.queryAdministrationInfo(administrationId);
    }

    @GetMapping("/queryIdIsExist")
    public  boolean queryIdIsExist(Integer administrationId){
        return administrationUserService.queryIdIsExist(administrationId);
    }
}
