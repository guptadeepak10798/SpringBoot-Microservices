package com.example.libraryservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "libarary")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  id ;
    private String name ;
    private String address;
    private String email;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book ;


}
