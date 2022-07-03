package com.example.demo.Service;

import com.example.demo.Entity.Book;

public interface IServiceBook {

    public Book created (Book book);
    public Book findById(Long id );
    public void deleteById(Long id);



}
