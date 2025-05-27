package com.app.binding;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder()
public class Book {
	@JsonProperty(value = "bookId")
	private Integer Id;
	private String Name;
	private Double Price;

}
