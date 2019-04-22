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
public class User {
    @Id
    private String id;

    private String username;

    private String password;

   }