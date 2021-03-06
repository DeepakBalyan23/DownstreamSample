package com.stackroute.eplay.downstreamservice.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class Movie {
	
	@Id
	private String id;
	private String name;
	private String poster;
	private String genre;
	private String language;
	private String reviews;
	private String cast;
	private String description;  
	private int rating;
	private int duration;
	private List<MovieEvent> movieEvents;
}
