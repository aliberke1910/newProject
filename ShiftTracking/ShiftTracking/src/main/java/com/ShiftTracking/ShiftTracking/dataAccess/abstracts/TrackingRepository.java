package com.ShiftTracking.ShiftTracking.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ShiftTracking.ShiftTracking.entity.concretes.Tracking;

public interface TrackingRepository extends JpaRepository<Tracking, Integer>{
	

}
