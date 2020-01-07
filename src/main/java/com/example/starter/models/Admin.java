package com.example.starter.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Data
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private  String email;

    @Column(name = "contact_no")
    private  String contactNo;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role roles;

    public Admin(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
