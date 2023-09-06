package it.drwolf.resources;

import it.drwolf.model.entities.Book;
import it.drwolf.repositories.BookRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/book")
public class BookResource {

	@Inject
	BookRepository bookRepository;


	@GET
	public List<Book> all(){
		return bookRepository.listAll();
	}

}
