package com.stackroute.eplay.downstreamservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.eplay.downstreamservice.domain.MovieEvent;
import com.stackroute.eplay.downstreamservice.domain.User;

@Repository
public interface UserRepository  extends MongoRepository<User, String> {

}
