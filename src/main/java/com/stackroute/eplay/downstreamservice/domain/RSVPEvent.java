package com.stackroute.eplay.downstreamservice.domain;

import java.sql.Date;
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
public class RSVPEvent {

	@Id
	private String id;
	private String name;
	private Date startDate;
	private Date startTime;
	private Date endDate;
	private Date endTime;
	private String city;
	private String location;
	private String poster;
	private String type;
	private String description;
	private String performers;
	private String termsAndConditions;
	private String notes;
	private int numberOfAttendees;
	private boolean isCompleted;
	private List<Invitation> rsvpInvitation;

}
