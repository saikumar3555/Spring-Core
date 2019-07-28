package com.nit.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class DateService {
	
	public static Date getTodayDate() {
		return new Date();
	}

}
