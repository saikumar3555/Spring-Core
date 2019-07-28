package com.nt.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class DateService {
	public DateService() {
		System.out.println("DateService.DateService()");
	}

	public static Date getTodayDate() {
		return new Date();
		
	}
}
