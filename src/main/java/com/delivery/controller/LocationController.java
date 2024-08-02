package com.delivery.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	private KafkaService kafkaService;
	
	@GetMapping("/update")
	public ResponseEntity<?> updateLocation(){
		
//		this.kafkaService.updateLocation("( "+Math.round(Math.random()*1000)+""+" ,  "+Math.round(Math.random()*1000)+")");
		return new ResponseEntity<>(Map.of(" message","Location updated."),HttpStatus.OK);
		
	}

}
