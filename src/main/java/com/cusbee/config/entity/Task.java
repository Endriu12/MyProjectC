package com.cusbee.config.entity;

import com.cusbee.config.entity.enums.TaskStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

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

    @Column(name = "name")
    private String name;

    @Column(name = "dateTask")
    private Date dateTask;

    @Column(name = "estimate")
    private Date estimate;

    @Column(name = "taskStatus")
    private TaskStatus taskStatus;
}
