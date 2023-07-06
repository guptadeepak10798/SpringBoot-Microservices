package com.example.libraryservice.service;

import com.example.libraryservice.entity.Library;
import com.example.libraryservice.repo.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepo libraryRepo;


    public Library insertLibrary(Library library) {
       return libraryRepo.save(library);
    }

    public Library getLibraryById(int  id) {
       return libraryRepo.findById(id).get();
    }


}
