package com.cusbee.config.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Endriu on 01.12.2016.
 */
@RestController
public class TaskController {

    @RequestMapping(value = "Mymethod", method = RequestMethod.GET)
       public String hi(){
            return null;
        }

}