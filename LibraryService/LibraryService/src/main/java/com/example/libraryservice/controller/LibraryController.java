package com.example.libraryservice.controller;

import com.example.libraryservice.entity.Book;
import com.example.libraryservice.entity.Library;
import com.example.libraryservice.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/library/")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(value = "/insert")
    public Library insertLibrary(@RequestBody  Library library){
        return libraryService.insertLibrary(library);
    }

    @GetMapping(value = "/Library/{id}")
    public Library getLibraryById(@PathVariable int id){
        Book book = restTemplate.getForObject("http://localhost:9093/book/Book/"+id,Book.class);
        Library library = libraryService.getLibraryById(id);
        library.setBook(book);
        return library;
    }

    //calling bookservice inside libraryservice

}
