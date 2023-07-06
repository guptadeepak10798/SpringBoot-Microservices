package com.example.bookservice.service;

import com.example.bookservice.entity.Book;
import com.example.bookservice.repo.BookRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public Book getBookById(int id ){

        return  bookRepo.findById(id).get();

    }

    public Book insertBook(Book book ){

        return  bookRepo.save(book);

    }
}
