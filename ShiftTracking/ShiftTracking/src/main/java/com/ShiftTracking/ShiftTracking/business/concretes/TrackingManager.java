package com.ShiftTracking.ShiftTracking.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ShiftTracking.ShiftTracking.business.abstracts.TrackingService;
import com.ShiftTracking.ShiftTracking.business.requests.AddTrackingRequest;
import com.ShiftTracking.ShiftTracking.business.responses.GetAllTrackingsResponse;
import com.ShiftTracking.ShiftTracking.dataAccess.abstracts.TrackingRepository;
import com.ShiftTracking.ShiftTracking.entity.concretes.Tracking;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TrackingManager implements	TrackingService{
	
	private TrackingRepository trackingRepository;

	public List<GetAllTrackingsResponse> getAll() {
		
		List<Tracking> trackings = trackingRepository.findAll();
		List<GetAllTrackingsResponse> trackingResponses = new ArrayList<GetAllTrackingsResponse>();
		
		for (Tracking tracking : trackings) {
			GetAllTrackingsResponse responseItem = new GetAllTrackingsResponse();
			responseItem.setId(tracking.getId());
			responseItem.setName(tracking.getFirstName());
			responseItem.setName(tracking.getLastName());
			trackingResponses.add(responseItem);
		}
		return trackingResponses;
		
	}

	@Override
	public void addTracking(AddTrackingRequest trakingRequest) {
		Tracking tracking = new Tracking();
		tracking.setFirstName(tracking.getFirstName());
		this.trackingRepository.save(tracking);
		
	}

	@Override
	public void deleteTracking(Tracking traking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTracking(Tracking traking) {
		// TODO Auto-generated method stub
		
	}

}
