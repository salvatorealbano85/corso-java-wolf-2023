package it.drwolf.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import it.drwolf.model.entities.Author;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AuthorRepository implements PanacheRepository<Author> {
}
