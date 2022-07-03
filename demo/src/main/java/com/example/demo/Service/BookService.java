package com.example.demo.Service;

import com.example.demo.Entity.Book;
import com.example.demo.Repository.IBookRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class BookService  implements IServiceBook{

    private IBookRepository repository;



    @Override
    public Book created(Book book) {
        return repository.save(book);
    }

    @Override
    public Book findById(Long id) {
        Optional<Book> byId = repository.findById(id);
        return byId.get();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
