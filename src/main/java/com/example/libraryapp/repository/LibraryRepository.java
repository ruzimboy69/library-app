package com.example.libraryapp.repository;

import com.example.libraryapp.entity.Book;
import com.example.libraryapp.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibraryRepository
        extends JpaRepository<Library, Integer> {

    List<Library> findAllByNameContainsOrAddress_CityContains(String name, String city);

}
