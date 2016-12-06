package com.cusbee.config.entity;

import com.cusbee.config.entity.enums.TaskStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Endriu on 02.12.2016.
 */
@Getter
@Setter
@Entity
@Table(name = "task")

public class Task {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_task")
    private Date dateTask;

    @Column(name = "estimate")
    private Date estimate;

    @Column(name = "technologies")
    private String technologies;

    @Column(name = "task_status")
    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;

    /**
     * pattern Builder
     */
    private Task() {}

    public static Builder Build() {
        return new Task().new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public Builder setName(String name) {
            Task.this.setName(name);
            return this;
        }

        public Builder setDateTask(Date date) {
            Task.this.setDateTask(date);
            return this;
        }

        public Builder setEstimate(Date date) {
            Task.this.setEstimate(date);
            return this;
        }

        public Builder setTechnologies(String name) {
            Task.this.setTechnologies(name);
            return this;
        }

        public Builder setTaskStatus(TaskStatus taskStatus){
            Task.this.setTaskStatus(taskStatus);
            return this;
        }
        public Task build() {
            return Task.this;
        }
    }
}