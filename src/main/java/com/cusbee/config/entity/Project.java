package com.cusbee.config.entity;

import com.cusbee.config.entity.enums.ProjectStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by Endriu on 02.12.2016.
 */
@Setter
@Getter
@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "deadline")
    private Date deadline;

    @Column(name = "project_status")
    @Enumerated(EnumType.STRING)
    private ProjectStatus projectStatus;

    /**
     * pattern Builder
     */

    private Project() {
    }

    public static Builder Build() {
        return new Project().new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public Builder setName(String name) {
            Project.this.setName(name);
            return this;
        }

        public Builder setStartDate(Date date) {
            Project.this.setStartDate(date);
            return this;
        }

        public Builder setDeadline(Date date) {
            Project.this.setDeadline(date);
            return this;
        }

        public Builder setProjectStatus(ProjectStatus projectStatus){
            Project.this.setProjectStatus(projectStatus);
            return this;
        }

        public Project build() {
            return Project.this;
        }
    }
}