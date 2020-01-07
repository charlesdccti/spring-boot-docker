package com.example.starter.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@EqualsAndHashCode(exclude = "admins")
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Set<Admin> admins;

    public Role(String name, Admin... admins) {
        this.name = name;
        this.admins = Stream.of(admins).collect(Collectors.toSet());
        this.admins.forEach(x -> x.setRoles(this));
    }

}
