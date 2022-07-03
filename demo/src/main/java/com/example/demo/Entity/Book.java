package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_book")
    private Long id;
    @Column(name = "name_book")
    private String nameBook;
    @Column(name = "title")
    private String title;
    @Column(name = "name_author")
    private String author;

}
