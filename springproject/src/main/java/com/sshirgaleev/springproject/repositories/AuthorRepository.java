package com.sshirgaleev.springproject.repositories;

import com.sshirgaleev.springproject.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author, Long>{

}
