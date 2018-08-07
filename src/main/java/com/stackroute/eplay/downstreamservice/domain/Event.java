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
    
    public Event() {}
    
	public Event(String eventId, String eventName, String eventCity) {
	super();
	this.eventId = eventId;
	this.eventName = eventName;
	this.eventCity = eventCity;
}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventCity() {
		return eventCity;
	}
	public void setEventCity(String eventCity) {
		this.eventCity = eventCity;
	}
    
    
}
