package it.drwolf.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import it.drwolf.model.entities.Book;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BookRepository implements PanacheRepository<Book> {
}
