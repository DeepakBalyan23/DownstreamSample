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
public class User {

	@Id
    private String username;
    private String password;
    private String fullName;
    private String contactNo;
    private String email;
    private String gender;
    private String city;
    private List<Theatre> theatres;
}
