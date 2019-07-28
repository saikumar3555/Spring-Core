package com.nit.controller;

import com.nit.service.Engine;

public class Car {

	private Engine engine=null;
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void drive() {
		engine.start();
	}
}
