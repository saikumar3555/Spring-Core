package com.tcs.beans;

import java.util.List;

import lombok.Data;
@Data
public class Meeting {
	
	private int meetingId;
	private String meetingName;
	private String meetingPurpose;
	private List<String> participants;

}
