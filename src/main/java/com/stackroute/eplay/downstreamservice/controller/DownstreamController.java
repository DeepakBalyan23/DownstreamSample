package com.stackroute.eplay.downstreamservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.eplay.downstreamservice.domain.Event;
import com.stackroute.eplay.downstreamservice.service.DownstreamService;
import com.stackroute.eplay.downstreamservice.EventStreams;

//@RestController
@EnableBinding(EventStreams.class)
//@CrossOrigin("*")
//@RequestMapping("/api/v1")
public class DownstreamController {
	
	private DownstreamService downstreamService;
	
	@Autowired
	public DownstreamController(DownstreamService downstreamService){
		this.downstreamService = downstreamService;
	}

	@StreamListener(EventStreams.INPUT)
	//@PostMapping
	public void handle(@Payload Event event) {
		downstreamService.saveEvent(event);
		System.out.println(event.eventId + " Downstream");
	}
	
}
