package com.example.libraryservice.repo;

import com.example.libraryservice.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepo extends JpaRepository<Library,Integer> {

}
