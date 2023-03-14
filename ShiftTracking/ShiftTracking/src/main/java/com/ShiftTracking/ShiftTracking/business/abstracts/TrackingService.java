package com.ShiftTracking.ShiftTracking.business.abstracts;

import java.util.List;

import com.ShiftTracking.ShiftTracking.business.requests.AddTrackingRequest;
import com.ShiftTracking.ShiftTracking.business.responses.GetAllTrackingsResponse;
import com.ShiftTracking.ShiftTracking.entity.concretes.Tracking;

public interface TrackingService {
	List <GetAllTrackingsResponse> getAll();
	void addTracking(AddTrackingRequest trakingRequest);
	void deleteTracking(Tracking traking);
	void updateTracking(Tracking traking);
}
