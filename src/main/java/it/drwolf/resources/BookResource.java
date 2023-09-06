package it.drwolf.resources;

import it.drwolf.model.dtos.BookDTO;
import it.drwolf.model.entities.Book;
import it.drwolf.repositories.BookRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
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

	@POST
	@Transactional
	public Book add(Book book){
		bookRepository.persist(book);
		return book;
	}

}
