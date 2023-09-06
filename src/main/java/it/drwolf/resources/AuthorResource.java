package it.drwolf.resources;

import java.util.List;

import it.drwolf.model.entities.Author;
import it.drwolf.model.entities.Book;
import it.drwolf.repositories.AuthorRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/author")
public class AuthorResource {
	@Inject
	AuthorRepository authorRepository;


	@GET
	public List<Author> all(){
		return authorRepository.listAll();
	}

	@POST
	@Transactional
	public Author add(Author author){
		authorRepository.persist(author);
		return author;
	}
}
