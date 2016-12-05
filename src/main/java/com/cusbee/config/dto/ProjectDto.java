package com.cusbee.config.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by Endriu on 04.12.2016.
 */

@Getter
@Setter
public class ProjectDto {

    private String name;

    private Date startdate;

    private Date deadline;

}
