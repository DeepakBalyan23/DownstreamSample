package com.stackroute.eplay.downstreamservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.eplay.downstreamservice.domain.Event;
import com.stackroute.eplay.downstreamservice.repository.DownstreamRepository;

@Service
public class DownstreamServiceImpl implements DownstreamService{
	private DownstreamRepository downstreamRepository;

	@Autowired
	public DownstreamServiceImpl(DownstreamRepository downstreamRepository) {
		super();
		this.downstreamRepository = downstreamRepository;
	}

	@Override
	public void saveEvent(Event event){
		downstreamRepository.save(event);
	}

	@Override
	public Iterable<Event> getAllEvent() {
		return downstreamRepository.findAll();
	}
}
