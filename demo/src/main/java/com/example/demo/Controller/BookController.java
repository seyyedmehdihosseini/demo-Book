package com.example.demo.Controller;

import com.example.demo.Entity.Book;
import com.example.demo.Service.IServiceBook;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookController {

    private IServiceBook service;

    @PostMapping(value = "/save")
    public Book save(@RequestBody Book book){
        return service.created(book);
    }

    @GetMapping(value = "/get/{id}")
    public Book getById(@PathVariable Long id ){
        return service.findById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Long id){
        service.deleteById(id);
    }
}
