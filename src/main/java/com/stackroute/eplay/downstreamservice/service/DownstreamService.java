package com.stackroute.eplay.downstreamservice.service;

import com.stackroute.eplay.downstreamservice.domain.Event;

public interface DownstreamService {

	public void saveEvent(Event event);
	public Iterable<Event> getAllEvent();
}
