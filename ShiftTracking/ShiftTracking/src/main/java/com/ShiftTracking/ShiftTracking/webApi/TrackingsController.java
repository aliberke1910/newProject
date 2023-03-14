package com.ShiftTracking.ShiftTracking.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ShiftTracking.ShiftTracking.business.abstracts.TrackingService;
import com.ShiftTracking.ShiftTracking.business.requests.AddTrackingRequest;
import com.ShiftTracking.ShiftTracking.business.responses.GetAllTrackingsResponse;

@RestController
@RequestMapping ("/api/trackings")
public class TrackingsController {
	public TrackingService trackingService;
	
	@Autowired
	public TrackingsController(TrackingService trackingService) {
		this.trackingService=trackingService;
	}
	
	@GetMapping("/getall")
	public List<GetAllTrackingsResponse> getAll() {
		return trackingService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestAttribute AddTrackingRequest addTrackingRequest) {
		this.trackingService.addTracking(addTrackingRequest);
	}
	
}
