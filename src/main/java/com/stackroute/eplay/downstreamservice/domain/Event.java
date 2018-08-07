package com.stackroute.eplay.downstreamservice.domain;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Event {
	
	@Id
	public String eventId;
	public String eventName;
   /* public Date eventStartTime;
    public Date eventEndTime;*/
    public String eventCity;
}
