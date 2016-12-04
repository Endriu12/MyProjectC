package com.cusbee.config.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by Endriu on 02.12.2016.
 */
@Entity
@Table(name = "project")
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "startdate")
    private Date startdate;

    @Column(name = "deadline")
    private Date deadline;


}
