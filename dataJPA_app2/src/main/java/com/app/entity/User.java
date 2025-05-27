package com.app.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "USER_ID") 
    private Integer userId;
    @Column(name= "USER_NAME") 
    private String userName;
    @Column(name= "AGE") 
    private Integer age;
    @Column(name= "GENDER") 
    private String gender;
    @Column(name= "COUNTRY") 
    private String country;
    
}
