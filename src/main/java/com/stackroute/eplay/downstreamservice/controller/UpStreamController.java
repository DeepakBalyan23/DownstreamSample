package com.stackroute.eplay.downstreamservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.eplay.downstreamservice.EventStreams;
import com.stackroute.eplay.downstreamservice.domain.Event;
import com.stackroute.eplay.downstreamservice.service.DownstreamService;

@RestController
public class UpStreamController {
	private final EventStreams eventStreams;

	public UpStreamController(EventStreams eventStreams) {
		this.eventStreams = eventStreams;
	}

	@Autowired
	private DownstreamService downstreamService;

	@PostMapping("/events")
	public Event greetings(@RequestBody Event event) {
		MessageChannel messageChannel = eventStreams.outboundEvents();
		messageChannel.send(MessageBuilder.withPayload(event)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
		System.out.println(event.eventId + " Upstream");
		return event;
	}

	@GetMapping("/getEvents")
	public Iterable<Event> getgreetings() {
		return downstreamService.getAllEvent();
	}
}
