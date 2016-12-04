package com.cusbee.config.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Endriu on 02.12.2016.
 */
@Entity
@Table(name = "task")
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "taskname")
    private String taskname;

}
