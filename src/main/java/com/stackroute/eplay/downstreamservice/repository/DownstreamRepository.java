package com.stackroute.eplay.downstreamservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.eplay.downstreamservice.domain.Event;

@Repository
public interface DownstreamRepository extends CrudRepository<Event, String> {
}
