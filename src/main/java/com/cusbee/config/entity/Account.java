package com.cusbee.config.entity;

import com.cusbee.config.entity.enums.AccountType;
import com.cusbee.config.entity.enums.EmploymentType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Endriu on 05.12.2016.
 */

@Entity
@Table(name = "account")
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "position", nullable = false)
    private  String position;

    @Column(name = "accountType", nullable = false)
    private AccountType accountType;

    @Column(name = "dateBirthday", nullable = false)
    private Date dateBirthday;

    @Column(name = "employment", nullable = false)
    private EmploymentType employment;

    @Column(name = "experience", nullable = false)
    private  String experience;

    @Column(name = "languages", nullable = false)
    private  String languages;

    @Column(name = "technologiest", nullable = false)
    private String technologiest;


}
