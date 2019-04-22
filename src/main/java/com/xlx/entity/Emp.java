package com.xlx.entity;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    @Id
    private String id;

    private String name;

    private Integer sex;

    private Integer age;

    private Integer salary;

}