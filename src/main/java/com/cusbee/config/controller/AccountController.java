package com.cusbee.config.controller;


import com.cusbee.config.dto.AccountDto;
import com.cusbee.config.entity.Account;
import com.cusbee.config.exception.BaseException;
import com.cusbee.config.repository.AccountRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "account")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @ApiOperation(value="Save new User")
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseEntity<Account> saveAccout(@RequestBody AccountDto accountDto) throws BaseException{
        Account account = new Account();
        account.setUsername(accountDto.getUsername());
        account.setPassword(accountDto.getPassword());
        accountRepository.save(account);
        return new ResponseEntity<Account>(account, HttpStatus.CREATED);

    }

    @ApiOperation(value="Get a list of users")
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Account> getAll() {
        return accountRepository.getAll();
    }

    @ApiOperation(value="Delete User!")
    @RequestMapping(value = "remove/{id}", method = RequestMethod.POST)
    public ResponseEntity<String> removeAccount(@PathVariable("id") Long id){
        Account account = accountRepository.getOne(id);
        accountRepository.delete(account);
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
