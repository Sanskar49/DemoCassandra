package com.example.CassandraDemoProject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("customer")
public class Customer {

    @PrimaryKey
    private Long id;


    private String firstname;


    private String lastname;


    private int age;


}
