package com.cusbee.config.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Endriu on 02.12.2016.
 */

@Entity
@Table(name = "account")
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

}
