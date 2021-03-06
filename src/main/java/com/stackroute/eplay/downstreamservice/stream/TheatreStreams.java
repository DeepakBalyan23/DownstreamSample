package com.stackroute.eplay.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface TheatreStreams {
	String INPUT = "theatre-in";
    @Input(INPUT)
    SubscribableChannel inboundTheatre();
}
