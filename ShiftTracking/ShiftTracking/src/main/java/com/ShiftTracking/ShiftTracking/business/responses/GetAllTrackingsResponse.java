package com.ShiftTracking.ShiftTracking.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTrackingsResponse {
	private int id;
	private String name;
}
