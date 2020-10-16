package com.sj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.repository.DataService;
@Service
public class BusinessService {

	@Autowired
	DataService dataservice;

	
	public int findGreatestNumber() {
		int [] data = dataservice.retrieveAllData();
		int max= Integer.MIN_VALUE;
		for(int val:data) {
			
			if(val > max) {
				
				max = val;
			}
			
		}
		return max;
	
	}
}
	
	

