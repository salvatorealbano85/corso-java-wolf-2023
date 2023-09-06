package it.drwolf.model.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Book extends PanacheEntity {

	private String title;
	private Date publication;

	@ManyToOne(optional = false)
	private Author author;
}
