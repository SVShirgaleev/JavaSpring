package com.sshirgaleev.springproject.bootstrap;

import com.sshirgaleev.springproject.model.Author;
import com.sshirgaleev.springproject.model.Book;
import com.sshirgaleev.springproject.model.Publisher;
import com.sshirgaleev.springproject.repositories.AuthorRepository;
import com.sshirgaleev.springproject.repositories.BookRepository;
import com.sshirgaleev.springproject.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();

    }


    private void initData(){

        Publisher publisher = new Publisher("Izi");

        publisherRepository.save(publisher);

        Author author1 = new Author("Salavat" ,"Shirgaleev" );
        Book book1 = new Book("How to write ", "1234", publisher);
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);

        authorRepository.save(author1);
        bookRepository.save(book1);


        Author author2 = new Author("Azamat" ,"Shirgaleev" );
        Book book2 = new Book("How to don't  ", "1235", publisher);
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);

        authorRepository.save(author2);
        bookRepository.save(book2);


    }
}
