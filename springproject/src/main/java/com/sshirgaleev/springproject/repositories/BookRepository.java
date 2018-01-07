package com.sshirgaleev.springproject.repositories;

import com.sshirgaleev.springproject.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
