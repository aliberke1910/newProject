package com.ShiftTracking.ShiftTracking.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddTrackingRequest {
	private String firstName;
	private String lastName;
	private String department;
}
