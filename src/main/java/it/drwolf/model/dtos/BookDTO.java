package it.drwolf.model.dtos;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

@JsonSerialize
public record BookDTO (String title, Date publication, String author) {
}
